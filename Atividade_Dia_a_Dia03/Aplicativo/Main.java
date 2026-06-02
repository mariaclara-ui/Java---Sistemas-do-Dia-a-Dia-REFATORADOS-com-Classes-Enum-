package Atividade_Dia_a_Dia03.Aplicativo;

import Atividade_Dia_a_Dia03.Entidades.Clinica;
import Atividade_Dia_a_Dia03.Entidades.enums.status;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu nome:");
            String nome = sc.nextLine();

            System.out.println("Digite o seu CPF:");
            String cpf = sc.nextLine();


            System.out.println("Qual a especialidade desejada?");
            String especialidade = sc.nextLine();

            status status= Atividade_Dia_a_Dia03.Entidades.enums.status.IMFORMACOES_ADICIONADAS;
            System.out.println(status.getDescricao());

            System.out.println("Horários disponíveis: 13:00 16:00 20:00");
            System.out.println("Digite o horário escolhido:");
            String horario = sc.nextLine();




            System.out.println("Deseja confirmar a consulta?");
            String consulta = sc.nextLine();

            Clinica clinica = new Clinica(nome, cpf, especialidade, horario, consulta);


            ArrayList<String> cpfsCadastrados = new ArrayList<>();

            cpfsCadastrados.add("15003557639");
            cpfsCadastrados.add("01973839636");

            if (cpfsCadastrados.contains(clinica.getCpf())) {

                System.out.println("Paciente cadastrado");

            } else {

                System.out.println("Paciente não cadastrado");
            }

            if (clinica.getHorario().equals("13:00") ||
                    clinica.getHorario().equals("16:00") ||
                    clinica.getHorario().equals("20:00"))
            {
                status= Atividade_Dia_a_Dia03.Entidades.enums.status.VERIFICANDO_HORARIO_DISPONIVEL;
                System.out.println(status.getDescricao());

                System.out.println("Horário disponível");

            } else {

                System.out.println("Horário indisponível");
            }

            if (clinica.getConsulta().equalsIgnoreCase("sim")) {
                status= Atividade_Dia_a_Dia03.Entidades.enums.status.COMSULTA_CONFIRMADA;
                System.out.println(status.getDescricao());


            } else {

               status= Atividade_Dia_a_Dia03.Entidades.enums.status.ATENDIMENTO_ENCERRADO;
               System.out.println(status.getDescricao());
            }
        }
    }