package Models;

public class Inscricao {

    private Participante participante;
    private Evento evento;
    private Organizador organizador;
    private String situacao;


    public Inscricao(Participante participante, Evento evento, Organizador organizador){

        this.participante = participante;
        this.evento = evento;
        this.organizador = organizador;


        if(evento == null){
            this.situacao = "Cancelada";
            System.out.println("Evento não pode ser nulo.");

        } else if (evento.ocuparVaga()) {
            this.situacao = "Confirmada";
            System.out.println("Inscrição confirmada no evento: " + evento.getNomeEvento());
            
        } else {
            this.situacao = "Cancelada";
            System.out.println("O evento " + evento.getNomeEvento() + " está lotado.");
        }
    }

    public void cancelar(){
        if (situacao.equals("Confirmada")){
            evento.liberarVaga();
            this.situacao = "Cancelada";
            System.out.println("Inscrição cancelada no evento: " + evento.getNomeEvento());
        }
        else {
            System.out.println("Inscrição já está cancelada.");
        }
    }

    public String getSituacao() {
        return situacao;
    }

    public void exibirInformacoes(){
        if (evento != null){
            System.out.println("Nome do participante: " + participante.getNome());
            System.out.println("Evento: " + evento.getNomeEvento());
            System.out.println("Local: " + evento.getLocal());
            System.out.println("Organizador: " + organizador.getNomeOrganizador());
            System.out.println("Situação da inscrição: " + getSituacao());
        }
        else{
            System.out.println("Evento nulo, verifique.");
        }
    }
}
