package model;
import java.util.ArrayList;
import java.util.List;

public class Participante {
    private String nome;
    private String cpf;
    private String email;
    private String curso;
    private List<Evento> eventosInscritos;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Evento> getEventosInscritos() {
        return eventosInscritos;
    }

    public void setEventosInscritos(List<Evento> eventosInscritos) {
        this.eventosInscritos = eventosInscritos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Participante(String nome , String cpf , String email , String curso){
        this.nome = nome;

        this.cpf = cpf;

        this.email = email;

        this.curso = curso;

        this.eventosInscritos = new ArrayList<>();
    }
}
