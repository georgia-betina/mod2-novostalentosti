package exercicios.introducao.exercicio4;

public class EmpresaCliente extends PessoaJuridica {
    private String nomeDaEmpresa;
    private String ramo;

    public EmpresaCliente (String nomeDaEmpresa, String ramo) {
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.ramo = ramo;
    }

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }
    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }
    public String getRamo() {
        return ramo;
    }
    public void setRamo(String ramo) {
        this.ramo = ramo;
    }
}
