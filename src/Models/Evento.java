package Models;

public class Evento {

    private String nomeEvento;
    private String local;
    private int capacidadeMaxima;
    private int vagasDisponiveis;


    public Evento (String nomeEvento, String local, int capacidadeMaxima, int vagasDisponiveis){

        this.nomeEvento = nomeEvento;
        this.local = local;
        this.capacidadeMaxima = capacidadeMaxima;
        this.vagasDisponiveis = vagasDisponiveis;

        if (vagasDisponiveis > capacidadeMaxima || vagasDisponiveis < 0){
            System.out.println("Número de vagas disponíveis é inválido," +
                    "quantidade alterada para acompanhar capacidade máxima.");
            this.vagasDisponiveis = capacidadeMaxima;
        }

    }

    public String getNomeEvento(){
        return nomeEvento;

    }

    public String getLocal(){
        return local;

    }

    public int getCapacidadeMaxima(){
        return capacidadeMaxima;

    }


    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void getInfoEvento(){
        System.out.println( getNomeEvento() );
        System.out.println("Local: " + getLocal() );
        System.out.println("Quantidade de vagas disponíveis: " + getVagasDisponiveis() );
    }


    public boolean ocuparVaga(){
        if(vagasDisponiveis > 0){
            vagasDisponiveis = vagasDisponiveis - 1;
            return true;
        }
        else return false;
    }

}
