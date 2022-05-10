package exercicios.introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import exercicios.introducao.exercicio4.EmpresaCliente;
import exercicios.introducao.exercicio4.Funcionario;
import exercicios.introducao.exercicio4.Pessoa;
import exercicios.introducao.exercicio4.PessoaFisica;
import exercicios.introducao.exercicio4.PessoaJuridica;

public class App7 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Funcionario funcionario1 = new Funcionario("Zezinho", "Professor");
        funcionario1.setCargo("Diarista");
        funcionario1.setNome("Ivanildo Pereira");
        funcionario1.setCpf("555.555.555-55");
        try {
            funcionario1.setDataNascimento(dateFormat.parse("22/01/1987"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        funcionario1.setTelefone("55555-5555");

        EmpresaCliente empresa1 = new EmpresaCliente("Estude", "Educação");
        empresa1.setCnpj("555-555-5555-55");
        try {
            empresa1.setDataCriacao(dateFormat.parse("02/05/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        empresa1.setNomeDaEmpresa("Educa");
        empresa1.setNome("Estela Vagner");
        empresa1.setRamo("Educação");
        empresa1.setTelefone("4444-4444");

        PessoaFisica pessoa1 = funcionario1;
        System.out.printf("Nome: %s\nCPF: %s\nData de nascimento: %s\nTelefone: %s", pessoa1.getNome(), pessoa1.getCpf(),dateFormat.format(pessoa1.getDataNascimento()),pessoa1.getTelefone());

        PessoaJuridica pessoa2 = empresa1;
        System.out.printf("\n\nNome: %s\nCNPJ: %s\nData de criação: %s\nTelefone: %s", pessoa2.getNome(), pessoa2.getCnpj(), dateFormat.format(pessoa2.getDataCriacao()), pessoa2.getTelefone());

        Pessoa pessoa3 = pessoa1;
        System.out.printf("\n\nNome: %s\nTelefone: %s", pessoa3.getNome(), pessoa3.getTelefone());

        Pessoa pessoa4 = pessoa2;
        System.out.printf("\n\nNome: %s\nTelefone: %s", pessoa4.getNome(), pessoa4.getTelefone());

        Funcionario funcionario2 = (Funcionario) pessoa3;
        System.out.printf("\n\nNome: %s\nCargo: %s\nCPF: %s\nData de nascimento: %s\nTelefone: %s", funcionario2.getNome(), funcionario2.getCargo(), funcionario2.getCpf(), dateFormat.format(funcionario2.getDataNascimento()), funcionario2.getTelefone());

        EmpresaCliente empresa2 = (EmpresaCliente) pessoa4;
        System.out.printf("\n\nNome: %s\nNome da empresa: %s\nRamo: %s\nCNPJ: %s\nData de criação: %s\nTelefone: %s", empresa2.getNome(), empresa2.getNomeDaEmpresa(), empresa2.getRamo(), empresa2.getCnpj(), dateFormat.format(empresa2.getDataCriacao()), empresa2.getTelefone());
    }
}
