package mvc.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import mvc.controller.PersonController;
import mvc.model.Person;

public class PersonForm extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	private PersonController personController = new PersonController();
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

	JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

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

		addButton.addActionListener(this);
		deleteButton.addActionListener(this);
		updateButton.addActionListener(this);
		closeButton.addActionListener(this);

		this.setLayout(new BorderLayout());
		this.add(fieldPanel);
		this.add(buttonPanel, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
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
				JOptionPane.showMessageDialog(this, "Record added successfully");
				fnText.setText("");
				lnText.setText("");
				dobText.setText("");
			}
		}

	}

}
