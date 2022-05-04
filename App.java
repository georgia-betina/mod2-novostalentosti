import introducao.Aplicativo;
import introducao.Celular;
import introducao.Pessoa;

public class App {
    public static void main(String[] args) {

    // Criando uma variável do tipo Pessoa
    // Criando uma instância de objeto a partir da classe Pessoa
        
    // passagem de parâmetros
    // instanciação
    Pessoa zezinho = new Pessoa("Zezinho");
    zezinho.setNome("Zezinho da Silva Sauro");
    zezinho.setCPF("555.555.555-55");
    zezinho.setAltura(1.75f);
    zezinho.setIdade(22);

    Pessoa luizinho = new Pessoa("Luiz");
    luizinho.setNome("Luizinho da Silva Sauro Jr");
    luizinho.setAltura(1.68f);
    luizinho.setIdade(17);

    System.out.println(zezinho.getNome());
    System.out.println(luizinho.getNome());

    System.out.println(zezinho.getAltura());
    System.out.println(luizinho.getAltura());

    zezinho.setAltura(0f);
    luizinho.setAltura(0f);

    System.out.println(zezinho.getAltura());
    System.out.println(luizinho.getAltura());

    String guardaResultado = zezinho.podeDirigir();
    System.out.println(guardaResultado);
    guardaResultado = luizinho.podeDirigir();
    System.out.println(guardaResultado);

    zezinho.mostraCPF(); // void não precisa criar variável
    luizinho.mostraCPF();

    Celular startak = new Celular("(47) 99999-9999");
    startak.setModelo("PT 550");
    startak.setMarca("Motorola");
    
    startak.setDono(zezinho);

    Aplicativo app1 = new Aplicativo("Angry Birds");
    Aplicativo app2 = new Aplicativo("Whatasapp");
    Aplicativo app3 = new Aplicativo("TikTok");
    Aplicativo app4 = new Aplicativo("Instagram");

    startak.getListaAplicativos().add(app1);
    startak.getListaAplicativos().add(app2);
    startak.getListaAplicativos().add(app3);
    startak.getListaAplicativos().add(app4);
    /*startak.getListaAplicativos().add("Laranja");
    startak.getListaAplicativos().add("Banana");
    startak.getListaAplicativos().add(1234);
    startak.getListaAplicativos().add(1200.05f);
    startak.getListaAplicativos().add(true);*/

    startak.getListaAplicativos().remove(2);
    startak.getListaAplicativos().set(2, new Aplicativo("GloboPlay"));
    System.out.println(startak.getListaAplicativos().indexOf(app1));

    for(int i=0; i < startak.getListaAplicativos().size(); i++) {
        System.out.println(startak.getListaAplicativos().get(i));
    }

    for(Object umApp:startak.getListaAplicativos()) { // quando usamos aplicativo, nao retorna nada
        System.out.println(umApp);
    }

    //var app = new Aplicativo("");
    //app.nome = "lalala";
    // TODO DASDAS
    }
}
