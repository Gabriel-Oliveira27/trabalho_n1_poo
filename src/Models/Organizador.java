package Models;

public class Organizador {

    private String nomeOrganizador;
    private int matricula;
    private String cargo;

    public Organizador (String nomeOrganizador, int matricula, String cargo){

        this.nomeOrganizador = nomeOrganizador;
        this.matricula = matricula;
        this.cargo = cargo;

    }

    public String getNomeOrganizador(){
        return nomeOrganizador;
    }

    public int getMatricula(){
        return matricula;
    }

    public String getCargo(){
        return cargo;

    }

}
