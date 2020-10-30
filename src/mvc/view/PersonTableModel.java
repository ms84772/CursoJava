package mvc.view;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class PersonTableModel implements TableModel {

	private CachedRowSet personRowSet;
	private ResultSetMetaData metadata;
	
	public PersonTableModel(CachedRowSet crs) throws SQLException{
		this.personRowSet = crs;
		this.metadata = this.personRowSet.getMetaData();
		
	}
	
//	String[] columnNames = {"Id","First Name","Last Name","Birthdate"};
//	Object[][] data = {
//			{"1","Mauricio","Sahagun","06/05/1972"},
//			{"2","Celene","Sandoval","12/13/1970"},
//			{"3","Samantha","Sahagun","09/30/2005"},
//			{"4","Martin","Munoz","09/24/1991"},
//			{"5","Diego","Sierra","06/05/1990"},
//	};

	@Override
	public int getRowCount() {
		int rows =0;
		try {
			rows = this.personRowSet.getMaxRows();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

	@Override
	public int getColumnCount() {
		int cols =0;
		try {
			cols = this.metadata.getColumnCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cols;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		//return data[rowIndex][columnIndex];
		try {
	        this.personRowSet.absolute(rowIndex + 1);
	        Object o = this.personRowSet.getObject(columnIndex + 1);
	        if (o == null)
	            return null;
	        else
	            return o.toString();
	    } catch (SQLException e) {
	        return e.toString();
	    }
	}

	@Override
	public String getColumnName(int columnIndex) {
		String columnName ="";
		try{
			columnName = this.metadata.getColumnLabel(columnIndex+1);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return columnName;
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		
	}
}
