package sistema.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import sistema.entity.Cliente;

public class ClienteService {
    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    public ClienteService(){
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        var cliente1 = new Cliente();
        cliente1.setNome("Zezinho");
        cliente1.setId(1);
        cliente1.setCpf("555.555.555-55");
        try {
            cliente1.setDataNascimento(dataFormatada.parse("02/02/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        listaClientes.add(cliente1);

        var cliente2 = new Cliente();
        cliente2.setNome("Mariazinha");
        cliente2.setId(2);
        cliente2.setCpf("666.666.666-66");
        try {
            cliente2.setDataNascimento(dataFormatada.parse("01/01/2011"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        listaClientes.add(cliente2);

        var cliente3 = new Cliente();
        cliente3.setNome("Juliazinha");
        cliente3.setId(3);
        cliente3.setCpf("777.777.777-77");
        try {
            cliente3.setDataNascimento(dataFormatada.parse("03/03/2003"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        listaClientes.add(cliente3);
    }

    public ArrayList<Cliente> getAllClientes(){
        return listaClientes;
    }
}
