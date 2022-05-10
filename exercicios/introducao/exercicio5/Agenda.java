package exercicios.introducao.exercicio5;

import java.text.SimpleDateFormat;
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
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        StringBuilder montadorString = new StringBuilder();
        montadorString.append(String.format("ID da agenda: %d", getId()));

        for (Agendamento agendamento : listaAgendamentos) {
            montadorString.append(String.format("\nID do agendamento: %d\nData do agendamento: %s\nID do paciente: %d\nNome do paciente: %s\nTelefone do paciente: %s\nID do médico: %d\nNome do médico: %s\nCRM do médico: %s", agendamento.getId(), dataFormatada.format(agendamento.getData()), agendamento.getPaciente().getId(), agendamento.getPaciente().getNome(), agendamento.getPaciente().getTelefone(), agendamento.getMedico().getId(), agendamento.getMedico().getNome(), agendamento.getMedico().getCRM()));
        }
        
        montadorString.append(String.format("\nID do médico: %d\nNome do médico: %s\nCRM: %s", getMedico().getId(), getMedico().getNome(), getMedico().getCRM()));

        System.out.printf("\n\nDados:\n%s", montadorString);
    }
}
