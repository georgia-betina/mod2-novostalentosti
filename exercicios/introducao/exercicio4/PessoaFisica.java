package exercicios.introducao.exercicio4;

import java.util.Date;

public class PessoaFisica {
    private Date  dataNascimento;
    private String cpf;
    
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
