package model;

public class Local {
   private String nomeIdentificador;
   private int capacidadeMaxima;
   private   String bloco;

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String getNomeIdentificador() {
        return nomeIdentificador;
    }

    public void setNomeIdentificador(String nomeIdentificador) {
        this.nomeIdentificador = nomeIdentificador;
    }

    public Local(String nomeIdentificador , int capacidadeMaxima , String bloco){

       this.nomeIdentificador = nomeIdentificador;
       this.capacidadeMaxima = capacidadeMaxima;
       this.bloco = bloco;

    }

}
