package model;

public class Auditorio extends Local{
    private boolean temSom;
    private boolean traducao;

    public boolean isTemSom() {
        return temSom;
    }

    public void setTemSom(boolean temSom) {
        this.temSom = temSom;
    }

    public boolean isTraducao() {
        return traducao;
    }

    public void setTraducao(boolean traducao) {
        this.traducao = traducao;
    }

    public Auditorio (String nomeIdentificador , int capacidadeMaxima, String bloco , boolean temSom , boolean traducao){
        super(nomeIdentificador, capacidadeMaxima, bloco);

        this.temSom = temSom;
        this.traducao = traducao;


    }

}
