package mvc.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.sql.rowset.CachedRowSet;
import javax.swing.JFrame;
import javax.swing.JSplitPane;

import mvc.dao.PersonDao;

public class PersonView extends JFrame {
	private static final long serialVersionUID = 1L;
	private PersonDao personDao = new PersonDao();
	PersonForm pf = new PersonForm();
	PersonTable pt ;
	JSplitPane jsp ;
	
	public PersonView() {
		CachedRowSet crs = personDao.getAllPersonCRS();
		this.pt = new PersonTable(crs);
		jsp = new JSplitPane(JSplitPane.VERTICAL_SPLIT,pf,pt);
		this.pack();
		this.add(jsp);
		this.setTitle("Person Module");
		this.setSize(800,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		PersonView pv = new PersonView();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)((dim.getWidth() - pv.getWidth())/2);
		int y = (int)((dim.getHeight() - pv.getHeight())/2);
		pv.setLocation(x, y);
	}
}
