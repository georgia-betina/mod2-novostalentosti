package exercicios.introducao;

import exercicios.introducao.exercicio4.EmpresaCliente;
import exercicios.introducao.exercicio4.Funcionario;

public class App7 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Zezinho", "Professor");
        EmpresaCliente empresa1 = new EmpresaCliente("Estude", "Educação");

        var pessoa1 = funcionario1;
        var pessoa2 = empresa1;

        System.out.printf(pessoa1.getNome() + " " + pessoa1.getCargo() + "\n");
        System.out.printf(empresa1.getNomeDaEmpresa() + " " + empresa1.getRamo() + "\n");

        var pessoa3 = pessoa1;
        var pessoa4 = pessoa2;

        System.out.printf(pessoa3.getNome() + " " + pessoa3.getCargo() + "\n");
        System.out.println(pessoa4.getNomeDaEmpresa() + " " + pessoa4.getRamo() + "\n");

        Funcionario funcionario2 = pessoa3;
        EmpresaCliente empreas2 = pessoa4;

        System.out.println(funcionario2.getNome() + " " + funcionario2.getCargo() + "\n");
        System.out.println(empreas2.getNomeDaEmpresa() + " " + empreas2.getRamo());
    }
}
