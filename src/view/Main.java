package view;
import Models.*;

public class Main{

    public static void main (String[] args){

        Participante participante = new Participante(
                "Gabriel",
                "02515718310",
                "gabrieloliveira@gmail.com"
        );

        System.out.println("Participante criado: " + participante.getNome());

        Organizador organizador = new Organizador(
                "Emanuel",
                1,
                "Recepcionista"
        );

        System.out.println("Organizador criado: " + organizador.getNomeOrganizador());

        Organizador organizador2 = new Organizador(
                "Sebrae Iguatu",
                2,
                "Organizador Geral"
        );

        System.out.println("Organizador criado: " + organizador2.getNomeOrganizador());

        Organizador organizador3 = new Organizador(
                "Senac Iguatu - Turma de Eventos",
                3,
                "Organizador Geral"
        );

        System.out.println("Organizador criado: " + organizador3.getNomeOrganizador());

        Evento evento = new Evento(
                "Iguatu Tech Summit I",
                "Imperium Paulista",
                120,
                1
        );

        System.out.println("Evento criado: " + evento.getNomeEvento());

        Evento evento2 = new Evento(
                "Maratona Empreendedora II",
                "Diocesano Hotel",
                80,
                2
        );

        System.out.println("Evento criado: " + evento2.getNomeEvento());

        Evento evento3 = new Evento(
                "Finalmente Eu",
                "Diocesano Hotel",
                25,
                0
        );

        System.out.println("Evento criado: " + evento3.getNomeEvento());

        Inscricao inscricao = new Inscricao(
                participante,
                evento,
                organizador
        );

        inscricao.exibirInformacoes();
        inscricao.cancelar();
        inscricao.exibirInformacoes();
        System.out.println("Vagas disponíveis no evento " + evento.getNomeEvento() + ": "+ evento.getVagasDisponiveis());


        // Teste de inscrição com evento lotado
        Inscricao inscricao2 = new Inscricao(
                participante,
                evento3,
                organizador3
        );

        // Teste de cancelamento de inscrição duas vezes
        Inscricao inscricao3 = new Inscricao(
                participante,
                evento2,
                organizador2
        );

        inscricao3.cancelar();
        inscricao3.cancelar();


    }

}