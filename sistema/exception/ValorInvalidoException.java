package sistema.exception;

public class ValorInvalidoException extends Exception {
    private String nomeCampo = "";

    public ValorInvalidoException(String mensagem, Exception origem, String nomeCampo) {
        this(mensagem, origem); // chama o próprio construtor
        this.nomeCampo = nomeCampo;
    }

    // mensagem de erro + campo + exception
    public ValorInvalidoException(String mensagem, Exception origem) {
        super(mensagem, origem); // chama o  construtor da superclass
    }
}
