package exercicios.introducao.exercicio4;

public class Funcionario extends PessoaFisica {
    private String nome;
    private String cargo;

    public Funcionario (String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
