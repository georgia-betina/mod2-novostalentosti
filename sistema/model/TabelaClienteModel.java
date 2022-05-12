package sistema.model;

import javax.swing.table.AbstractTableModel;

import sistema.controller.ListagemClienteController;

public class TabelaClienteModel extends AbstractTableModel {
    // Classe abstrata: junção de uma classe com uma interface

    private ListagemClienteController controller;

    public TabelaClienteModel(ListagemClienteController controller) {
        this.controller = controller;
    }

    @Override
    public int getRowCount() {
        return controller.getAllClientes().size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // if (rowIndex == 0) {
        //     return "Nao acredito";
        // }
        var umCliente = controller.getAllClientes().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return umCliente.getId();
            case 1:
                return umCliente.getNome();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        return new String[]{"Código", "Nome", "CPF", "Data Nascimento"}[column];
    }
    
    
}
