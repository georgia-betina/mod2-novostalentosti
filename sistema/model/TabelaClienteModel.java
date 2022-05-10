package sistema.model;

import javax.swing.table.AbstractTableModel;

public class TabelaClienteModel extends AbstractTableModel {
    // Classe abstrata: junção de uma classe com uma interface

    @Override
    public int getRowCount() {
        return 10;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex == 0) {
            return "Nao acredito";
        }
        return "";
    }
    
}
