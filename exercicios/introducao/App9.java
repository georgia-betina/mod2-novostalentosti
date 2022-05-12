package exercicios.introducao;

import exercicios.introducao.exercicio6.EquipeDeVendas;
import exercicios.introducao.exercicio6.Gerente;
import exercicios.introducao.exercicio6.Vendedor;

public class App9 {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Fulaninho1");
        vendedor1.setId(1);
        vendedor1.setTelefone("1111-1111");
        vendedor1.setMetaVendas(20);
        vendedor1.setPercComissao(20);
        Vendedor vendedor2 = new Vendedor();
        vendedor2.setNome("Fulaninho2");
        vendedor2.setId(2);
        vendedor2.setTelefone("2222-2222");
        vendedor2.setMetaVendas(10);
        vendedor2.setPercComissao(10);
        Vendedor vendedor3 = new Vendedor();
        vendedor3.setNome("Fulaninho3");
        vendedor3.setId(3);
        vendedor3.setTelefone("3333-3333");
        vendedor3.setMetaVendas(5);
        vendedor3.setPercComissao(5);
        Vendedor vendedor4 = new Vendedor();
        vendedor4.setNome("Fulaninho4");
        vendedor4.setId(4);
        vendedor4.setTelefone("4444-4444");
        vendedor4.setMetaVendas(2);
        vendedor4.setPercComissao(2);
        Vendedor vendedor5 = new Vendedor();
        vendedor5.setNome("Fulaninho5");
        vendedor5.setId(5);
        vendedor5.setTelefone("5555-5555");
        vendedor5.setMetaVendas(30);
        vendedor5.setPercComissao(30);

        Gerente gerente1 = new Gerente();
        gerente1.setNome("Gerente1");
        gerente1.setId(1);
        gerente1.setTelefone("6666-6666");
        gerente1.setSetor("Vendas");
        Gerente gerente2 = new Gerente();
        gerente2.setNome("Gerente2");
        gerente2.setId(2);
        gerente2.setTelefone("7777-7777");
        gerente2.setSetor("Financeiro");

        EquipeDeVendas equipe1 = new EquipeDeVendas();
        equipe1.setGestor(gerente1);
        equipe1.getListaVendedores().add(vendedor1);
        equipe1.getListaVendedores().add(vendedor2);
        equipe1.getListaVendedores().add(vendedor3);

        EquipeDeVendas equipe2 = new EquipeDeVendas();
        equipe2.setGestor(gerente2);
        equipe2.getListaVendedores().add(vendedor4);
        equipe2.getListaVendedores().add(vendedor5);

        System.out.println(equipe1.listarEquipe());
        System.out.println(equipe2.listarEquipe());
    }
}
