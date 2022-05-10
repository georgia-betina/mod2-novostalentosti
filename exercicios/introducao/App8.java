package exercicios.introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import exercicios.introducao.exercicio5.Agenda;
import exercicios.introducao.exercicio5.Agendamento;
import exercicios.introducao.exercicio5.Medico;
import exercicios.introducao.exercicio5.Paciente;

public class App8 {
    public static void main(String[] args) {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        Paciente paciente1 = new Paciente();
        paciente1.setId(01);
        paciente1.setNome("Ana");
        paciente1.setTelefone("1111-1111");
        Paciente paciente2 = new Paciente();
        paciente2.setId(02);
        paciente2.setNome("Beatriz");
        paciente2.setTelefone("2222-2222");
        Paciente paciente3 = new Paciente();
        paciente3.setId(03);
        paciente3.setNome("Carla");
        paciente3.setTelefone("3333-3333");
        Paciente paciente4 = new Paciente();
        paciente4.setId(04);
        paciente4.setNome("Daniele");
        paciente4.setTelefone("4444-4444");

        Medico medico1 = new Medico();
        medico1.setId(01);
        medico1.setNome("Danilo");
        medico1.setCRM("111");
        Medico medico2 = new Medico();
        medico2.setId(02);
        medico2.setNome("Eduardo");
        medico2.setCRM("222");

        Agenda agenda1 = new Agenda();
        agenda1.setMedico(medico1);
        Agenda agenda2 = new Agenda();
        agenda2.setMedico(medico2);

        Agendamento agendamento1 = new Agendamento();
        agendamento1.setId(001);
        try {
            agendamento1.setData(dataFormatada.parse("10/05/2022 18:20"));
            agendamento1.setPaciente(paciente1);
            agendamento1.setMedico(medico1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Agendamento agendamento2 = new Agendamento();
        agendamento2.setId(002);
        try {
            agendamento2.setData(dataFormatada.parse("11/05/2022 13:15"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        agendamento2.setPaciente(paciente2);
        agendamento2.setMedico(medico2);
        Agendamento agendamento3 = new Agendamento();
        agendamento3.setId(003);
        try {
            agendamento3.setData(dataFormatada.parse("12/05/2022 10:50"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        agendamento3.setPaciente(paciente3);
        agendamento3.setMedico(medico1);
        Agendamento agendamento4 = new Agendamento();
        agendamento4.setId(004);
        try {
            agendamento4.setData(dataFormatada.parse("13/05/2022 08:10"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        agendamento4.setPaciente(paciente4);
        agendamento4.setMedico(medico2);

        agenda1.getListaAgendamentos().add(agendamento1);
        agenda1.getListaAgendamentos().add(agendamento3);

        agenda2.getListaAgendamentos().add(agendamento2);
        agenda2.getListaAgendamentos().add(agendamento4);
        
        agenda1.imprimirAgenda();
        agenda2.imprimirAgenda();
    }
}
