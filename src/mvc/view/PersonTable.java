package mvc.view;

import java.awt.BorderLayout;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;

public class PersonTable extends JPanel {
	
	private static final long serialVersionUID = 1L;

	JButton b = new JButton("under construction");
	
	JTable table ;
	
	public PersonTable(CachedRowSet crs) {
		try {
			table = new JTable(new PersonTableModel(crs));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.setLayout(new BorderLayout());
		this.add(table);
		this.add(b,BorderLayout.SOUTH);
	}
}
