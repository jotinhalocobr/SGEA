package view;
import model.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Programa {
    public static void main(String[] args) {

        Sala sala1 = new Sala("Sala R",100,"Bloco C",304,true);
        Auditorio aud1 = new Auditorio("Auditorio Central",80,"Bloco B",true,true);
        Laboratorio lab1 = new Laboratorio("Laboratorio de Informatica",20,"Bloco A",20,"Computação");

        Organizador org1 = new Organizador("Julia Pera","Juliaperinha@gmail.com","Cordenadora");
        Instrutor isnt1 = new Instrutor("Marcos Pereira","Marcospj@gmail.com","Engenhero","TI");

        Palestra p1 = new Palestra("Inovação com IA",LocalDate.of(2025,05,19),1,1300,aud1,new Palestrante("Miguel Faria","Miguelf@gmail.com","UFRJ"));
        Minicurso m1 = new Minicurso("Java",LocalDate.of(2025,11,05),60,0,lab1,50,new ArrayList<>(List.of(isnt1)),new ArrayList<>(List.of("Computador")));
        Seminario s1 = new Seminario("Pretolio Inteligente",LocalDate.of(2025,11,12),2.3,1500,sala1,"Otimização de zonas de oleo","Marcelo","Henrique");

        Participante pa1 = new Participante("Lucas","23423424223","Lucaspr@gmail.com","Engenharia de software");
        Participante pa2 = new Participante("Maria","546565656","MAria@gmail.com","Engenharia da Computaçãp");
        Participante pa3 = new Participante("Pedro","898989898","Pedrok@gmail.com","Economia");
      Participante pa4 = new Participante("Roberto","23323232","Robertom@gmail.com","Advocacia");
        Participante pa5 = new Participante("Claudia","900909009","Claudias@gmail.com","Design");

        System.out.println("===== EVENTOS CRIADOS =====");
        System.out.println(p1.getTitulo() + " - Local: " + p1.getLocal().getNomeIdentificador());
        System.out.println(m1.getTitulo() + " - Local: " + m1.getLocal().getNomeIdentificador());
        System.out.println(s1.getTitulo() + " - Local: " + s1.getLocal().getNomeIdentificador());

        System.out.println("\n===== PARTICIPANTES =====");
        System.out.println(pa1.getNome() + " - " + pa1.getCurso());
        System.out.println(pa2.getNome() + " - " + pa2.getCurso());
        System.out.println(pa3.getNome() + " - " + pa3.getCurso());
        System.out.println(pa4.getNome() + " - " + pa4.getCurso());
        System.out.println(pa5.getNome() + " - " + pa5.getCurso());



    }
    }

