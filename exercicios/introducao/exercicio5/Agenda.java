package exercicios.introducao.exercicio5;

import java.util.ArrayList;

public class Agenda {
    private long id;
    private ArrayList<Agendamento> listaAgendamentos = new ArrayList<>();
    private Medico medico;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Agendamento> getListaAgendamentos() {
        return listaAgendamentos;
    }

    public void setListaAgendamentos(ArrayList<Agendamento> listaAgendamentos) {
        this.listaAgendamentos = listaAgendamentos;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void imprimirAgenda(){

    }
}
