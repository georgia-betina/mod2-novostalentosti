package exercicios.introducao.exercicio2;

public class Hospede {
    private String nome;
    private String cpf;
    private String telefone;

    public Hospede (String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

// import java.util.ArrayList;

// public class Hospede {
//     private String nome;
//     private String cpf;
//     private String telefone;
//     private ArrayList<Reserva> listaReservas = new ArrayList<>();

//     public ArrayList<Reserva> getListaReservas() {
//         return listaReservas;
//     }

//     public void setListaReservas(ArrayList<Reserva> listaReservas) {
//         this.listaReservas = listaReservas;
//     }

//     public Hospede(String cpf) {
//         this.cpf = cpf;
//     }

//     public String getNome() {
//         return nome;
//     }
//     public void setNome(String nome) {
//         this.nome = nome;
//     }
//     public String getCpf() {
//         return cpf;
//     }
//     public void setCpf(String cpf) {
//         this.cpf = cpf;
//     }
//     public String getTelefone() {
//         return telefone;
//     }
//     public void setTelefone(String telefone) {
//         this.telefone = telefone;
//     }
// }
