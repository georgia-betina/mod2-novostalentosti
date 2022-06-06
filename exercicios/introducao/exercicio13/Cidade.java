import java.util.ArrayList;

public class Cidade {
    private String nome;
    private ArrayList<Municipe> listaMunicipes = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Municipe> getListaMunicipes() {
        return listaMunicipes;
    }
    public void setListaMunicipes(ArrayList<Municipe> listaMunicipes) {
        this.listaMunicipes = listaMunicipes;
    }

    public int contaApartamentos() {
        final String contaApartamentos = "Apartamento";
        int quantidadeApartamentos = 0;
        for (Municipe umMunicipe : listaMunicipes) {
            String tipoDaResidencia = umMunicipe.getTipo().getNome();
            if (tipoDaResidencia.equals(contaApartamentos)) {
                quantidadeApartamentos++;
            }
        }
        return quantidadeApartamentos;
    }

    public int contaCasas() {
        final String contaCasas = "Casa";
        int quantidadeCasas = 0;
        for (Municipe umMunicipe : listaMunicipes) {
            String tipoDaResidencia = umMunicipe.getTipo().getNome();
            if (tipoDaResidencia.equals(contaCasas)) {
                quantidadeCasas++;
            }
        }
        return quantidadeCasas;
    }

    public static void main(String[] args) {
        Cidade cid1 = new Cidade();
        cid1.setNome("Joinville");

        Municipe mun1 = new Municipe();
        mun1.setNome("Zezinho");

        Municipe mun2 = new Municipe();
        mun2.setNome("Mariazinha");

        Municipe mun3 = new Municipe();
        mun3.setNome("Huguinho");

        Municipe mun4 = new Municipe();
        mun4.setNome("Zezinho");

        Municipe mun5 = new Municipe();
        mun5.setNome("Luizinho");

        TipoResidencia tipo1 = new TipoResidencia();
        tipo1.setNome("Apartamento");

        TipoResidencia tipo2 = new TipoResidencia();
        tipo2.setNome("Casa");

        mun1.setTipo(tipo1);
        mun2.setTipo(tipo1);
        mun3.setTipo(tipo1);
        mun4.setTipo(tipo2);
        mun5.setTipo(tipo2);

        cid1.getListaMunicipes().add(mun1);
        cid1.getListaMunicipes().add(mun2);
        cid1.getListaMunicipes().add(mun3);
        cid1.getListaMunicipes().add(mun4);
        cid1.getListaMunicipes().add(mun5);

        int quantidadeApartamentos = cid1.contaApartamentos();
        int quantidadeCasas = cid1.contaCasas();

        System.out.printf("A quantidade de casas é %d e a quantidade de apartamentos é %d.", quantidadeCasas, quantidadeApartamentos);
    }
}
