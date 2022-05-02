package exercicios.introducao.exercicio4;

import java.util.Date;

public class PessoaJuridica {
    private Date dataCriacao;
    private String cnpj;
    
    public Date getDataCriacao() {
        return dataCriacao;
    }
    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
