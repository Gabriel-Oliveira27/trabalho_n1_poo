package Models;

public class Inscricao {

    private Participante participante;
    private Evento evento;
    private Organizador organizador;


    public Inscricao(Participante participante, Evento evento, Organizador organizador){

        this.participante = participante;
        this.evento = evento;
        this.organizador = organizador;


        if(evento != null && evento.ocuparVaga() == true){

            System.out.println("Inscrição confirmada!");
        }
        else System.out.println("Inscrição falhou, vagas esgotadas!");


    }
}
