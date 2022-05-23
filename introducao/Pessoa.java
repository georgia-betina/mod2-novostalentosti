package introducao;

public class Pessoa {
    // Atributos
    // escopo de vida de instância
    private String nome; // private impede a alteração fácil | encapsular - POJO - Plain old Java object
    private int idade;
    private String CPF;
    private float altura;
    private static String raca;

    {

    }
    static {
        
    }

    // inner class
    static class Corpo {

    }

    public static void mostraRaca(){
        System.out.println(raca);
    }

    public String getCPF() {
        return CPF;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // GETTER e SETTER
    public String getNome(){ // método GET do nome
        return this.nome;
    }

    public void setNome(String nome){ // se eu quiser possibilitar a mudança da variável a partir de um método
        if(!nome.equals("")){
            this.nome = nome;
        }
    }

    // Comportamentos
    // CONSTRUTOR - inicializar um objeto e definir valores obrigatórios
    public Pessoa(String nome){ // escopo de vida local
        System.out.println("CONTRUTOR:" + nome);
        //this.nome = nome;
        setNome(nome); // proteger o objeto
    }

    // método (em outras linguagens mais antigas é chamado de função)
    // assinatura de um método
    // modificadorDeAcesso tipoDeRetorno nomeDoMetodo(parametros) { corpo }
    public String podeDirigir(){
        if(this.idade >= 18){ // não precisava utilizar o this porque não há outra variável no mesmo bloco com o mesmo nome
            return "Pode dirigir";
        } else {
            return "Não pode dirigir";
        }
    }

    public void mostraCPF(){
        System.out.println(this.CPF);
    }
}