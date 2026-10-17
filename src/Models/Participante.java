package Models;

public class Participante {

    private String nomeParticipante;
    private String cpf;
    private String email;

    public Participante(String nomeParticipante, String cpf, String email){

        this.nomeParticipante = nomeParticipante;
        this.cpf = cpf;
        this.email = email;

    }

    public String getNome(){
        return nomeParticipante;

    }

    public String getCpf(){
        return cpf;

    }

    public String getEmail(){
        return email;

    }
}