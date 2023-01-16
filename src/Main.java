import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

       /*System.out.println(curso1);
       System.out.println(curso2);
       System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIngrid = new Dev();
        devIngrid.setNome("Ingrid");
        devIngrid.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ingrid" + devIngrid.getConteudoInscritos());

        devIngrid.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos Inscritos Ingrid" + devIngrid.getConteudosConluidos());
        System.out.println("Conteúdos Concluídos Ingrid:" + devIngrid.getConteudosConluidos());

        Dev devSergio = new Dev();
        devSergio.setNome("Sergio");
        devSergio.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Sergio:" + devSergio.getConteudoInscritos());
        devSergio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscrítos Sergio" + devSergio.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Sergio" + devSergio.getConteudosConluidos());
    }

}