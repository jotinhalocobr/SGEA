package model;

import java.time.LocalDate;
import java.util.List;

public class Minicurso extends Evento{
    private List<Instrutor> instrutores;
    private double cargaHoraria;
    private List<String> materiais;

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(List<Instrutor> instrutores) {
        this.instrutores = instrutores;
    }

    public List<String> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<String> materiais) {
        this.materiais = materiais;
    }

    public Minicurso(String titulo , LocalDate data, double duracaoHoras  , double orcamento , Local local , double cargaHoraria , List <Instrutor> instrutores, List<String> materiais){

        super(titulo,data,duracaoHoras,orcamento,local);

        this.instrutores = instrutores;
        this.materiais = materiais;
        this.cargaHoraria = cargaHoraria;

    }
}
