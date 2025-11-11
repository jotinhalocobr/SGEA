package model;

public class Laboratorio extends Local{
    private int numeroComputadores;
    private String tipo;


    public int getNumeroComputadores() {
        return numeroComputadores;
    }

    public void setNumeroComputadores(int numeroComputadores) {
        this.numeroComputadores = numeroComputadores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Laboratorio (String nomeIdentificador , int capacidadeMaxima, String bloco , int numeroComputadores , String tipo){
        super(nomeIdentificador, capacidadeMaxima, bloco);

        this.numeroComputadores = numeroComputadores;
        this.tipo = tipo;



    }
}
