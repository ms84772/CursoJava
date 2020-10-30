package mvc.view;

import java.awt.BorderLayout;

import javax.sql.rowset.CachedRowSet;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PersonTable extends JPanel {
	
	private static final long serialVersionUID = 1L;

	JTable table ;
	JScrollPane jsp;
	
	public PersonTable(CachedRowSet crs) {
		table = new JTable(new RowSetModel(crs));
		jsp = new JScrollPane(table);
		this.setLayout(new BorderLayout());
		this.add(jsp);
	}
}
