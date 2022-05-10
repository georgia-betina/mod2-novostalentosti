package exercicios.introducao;

import java.text.SimpleDateFormat;

import exercicios.introducao.exercicio4.EmpresaCliente;
import exercicios.introducao.exercicio4.Funcionario;
import exercicios.introducao.exercicio4.PessoaFisica;

public class App7 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Funcionario funcionario1 = new Funcionario("Zezinho", "Professor");
        EmpresaCliente empresa1 = new EmpresaCliente("Estude", "Educação");

        PessoaFisica pessoa1 = funcionario1;
        System.out.printf("Nome: %s\nCPF: %s\nData de nascimento: %s\nTelefone: %s", pessoa1.getNome(), pessoa1.getCpf(),dateFormat.format(pessoa1.getDataNascimento()),pessoa1.getTelefone());

        var pessoa2 = empresa1;

        //System.out.printf(pessoa1.getNome() + " " + pessoa1.getCargo() + "\n");
        System.out.printf(empresa1.getNomeDaEmpresa() + " " + empresa1.getRamo() + "\n");

        var pessoa3 = pessoa1;
        var pessoa4 = pessoa2;

        //System.out.printf(pessoa3.getNome() + " " + pessoa3.getCargo() + "\n");
        System.out.println(pessoa4.getNomeDaEmpresa() + " " + pessoa4.getRamo() + "\n");

        //Funcionario funcionario2 = pessoa3;
        //EmpresaCliente empreas2 = pessoa4;

        //System.out.println(funcionario2.getNome() + " " + funcionario2.getCargo() + "\n");
        //System.out.println(empreas2.getNomeDaEmpresa() + " " + empreas2.getRamo());
    }
}
