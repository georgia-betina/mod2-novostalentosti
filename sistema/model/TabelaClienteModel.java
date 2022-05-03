package sistema.model;

import javax.swing.table.AbstractTableModel;

public class TabelaClienteModel extends AbstractTableModel {
    // Classe abstrata: junção de uma classe com uma interface

    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return 10;
    }

    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        if (rowIndex == 0) {
            return "Nao acredito";
        }
        return "";
    }
    
}
