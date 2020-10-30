package mvc.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sql.rowset.CachedRowSet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import mvc.controller.PersonController;
import mvc.dao.PersonDao;
import mvc.model.Person;

public class PersonForm extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	private PersonController personController = new PersonController();
	private PersonDao personDao = new PersonDao();
	DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

	JPanel fieldPanel = new JPanel(new GridLayout(3, 2));

	JLabel fnLabel = new JLabel("First Name: ", JLabel.TRAILING);
	JTextField fnText = new JTextField();

	JLabel lnLabel = new JLabel("Last Name: ", JLabel.TRAILING);
	JTextField lnText = new JTextField();

	JLabel dobLabel = new JLabel("DOB:(mm/dd/yyy) ", JLabel.TRAILING);
	JTextField dobText = new JTextField();

	JButton addButton = new JButton("Add");
	JButton deleteButton = new JButton("Delete");
	JButton updateButton = new JButton("Update");
	JButton closeButton = new JButton("Close");
	JButton refreshButton = new JButton("Refresh");

	JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	JTable table;
	
	int editingId = 0;
	
	public PersonForm() {
		fieldPanel.add(fnLabel);
		fieldPanel.add(fnText);
		fieldPanel.add(lnLabel);
		fieldPanel.add(lnText);
		fieldPanel.add(dobLabel);
		fieldPanel.add(dobText);

		buttonPanel.add(addButton);
		buttonPanel.add(deleteButton);
		buttonPanel.add(updateButton);
		buttonPanel.add(closeButton);
		buttonPanel.add(refreshButton);

		addButton.addActionListener(this);
		deleteButton.addActionListener(this);
		updateButton.addActionListener(this);
		closeButton.addActionListener(this);
		refreshButton.addActionListener(this);

		this.setLayout(new BorderLayout());
		this.add(fieldPanel);
		this.add(buttonPanel, BorderLayout.SOUTH);
	}

	@Override
	synchronized public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		if (e.getActionCommand().equals("Close")) {
			System.exit(0);
		}

		if (e.getActionCommand().equals("Add")) {

			String firstName = fnText.getText();
			String lastName = lnText.getText();
			String dob = dobText.getText();

			Person person = new Person();
			person.setFirstName(firstName);
			person.setLastName(lastName);
			try {
				person.setDob(df.parse(dob));
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			long rs = personController.addPerson(person);
			if(rs>0) {
				refreshTable();
				JOptionPane.showMessageDialog(this, "Record added successfully");
				fnText.setText("");
				lnText.setText("");
				dobText.setText("");
			}
		}
		if(e.getActionCommand().equals("Delete")) {
			int row = table.getSelectedRow();
			int id = (int) table.getModel().getValueAt(row, 0);
			String firstName = (String)table.getModel().getValueAt(row, 1);
			String lastName = (String)table.getModel().getValueAt(row, 2);
			String dob = table.getModel().getValueAt(row, 3)+"";
			String msg = String.format("Do you want to delete following record:\n"
					+ "Id:\t %s \n"
					+ "FirstName:\t %s \n"
					+ "Last Name:\t %s \n"
					+ "DOB:\t %s", id,firstName,lastName,dob);
			Window parent = SwingUtilities.getWindowAncestor(this);
			int x = JOptionPane.showConfirmDialog(parent, msg);
			System.out.println(x);
			if(x==0) {
				long rs = personController.deletePerson(id);
				if(rs>0) {
					refreshTable();
					JOptionPane.showMessageDialog(parent, "Record deleted Successfully");
				}
			}
			
			
		}
		if(e.getActionCommand().equals("Refresh")) {
			refreshTable();
		}
		if(e.getActionCommand().equals("Update")) {
			int row = table.getSelectedRow();
			int id = (int) table.getModel().getValueAt(row, 0);
			String firstName = (String)table.getModel().getValueAt(row, 1);
			String lastName = (String)table.getModel().getValueAt(row, 2);
			Date dob = (Date)table.getModel().getValueAt(row, 3);
			fnText.setText(firstName);
			lnText.setText(lastName);
			dobText.setText(df.format(dob));
			editingId = id;
			updateButton.setText("Save");
		}
		if(e.getActionCommand().equals("Update")) {
			int row = table.getSelectedRow();
			int id = (int) table.getModel().getValueAt(row, 0);
			String firstName = (String)table.getModel().getValueAt(row, 1);
			String lastName = (String)table.getModel().getValueAt(row, 2);
			Date dob = (Date)table.getModel().getValueAt(row, 3);
			fnText.setText(firstName);
			lnText.setText(lastName);
			dobText.setText(df.format(dob));
			editingId = id;
			updateButton.setText("Save");
		}
		if(e.getActionCommand().equals("Save")) {
			String firstName = fnText.getText();
			String lastName = lnText.getText();
			String dob = dobText.getText();

			Person person = new Person();
			person.setId(editingId);
			person.setFirstName(firstName);
			person.setLastName(lastName);
			try {
				person.setDob(df.parse(dob));
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			long rs = personController.updatePerson(person);
			if(rs>0) {
				refreshTable();
				JOptionPane.showMessageDialog(this, "Record updated successfully");
				fnText.setText("");
				lnText.setText("");
				dobText.setText("");
				editingId=0;
				updateButton.setText("Update");
			}

		}

	}

	private void refreshTable() {
		CachedRowSet crs = personDao.getAllPersonCRS();
		this.table.setModel(new RowSetModel(crs));
		this.table.repaint();
	}

}
