import desafio.dominio.*;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Trabalhando com java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("javaScript");
        curso2.setDescricao("javaScrip");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("java mentoria");
        mentoria.setData(LocalDate.now());




        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp code girls");
        bootcamp.setDescricao("Descrição bootcamp code girls");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        //Incricao dev
        Dev devJoyce = new Dev();
        devJoyce.setNome("Joyce");
        devJoyce.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Joyce " + devJoyce.getConteudosInscritos());

        System.out.println("----");
        devJoyce.progredir();
        devJoyce.progredir();
        System.out.println("Conteúdos inscritos Joyce " + devJoyce.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Joyce " + devJoyce.getConteudosConcluidos());
        System.out.println("XP adquirido: " + devJoyce.calcularTotalXp());
        System.out.println("----");

        //Incrição dev
        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos Ana " + devAna.getConteudosInscritos());

        System.out.println("----");
        devAna.progredir();
        devAna.progredir();
        devAna.progredir();
        System.out.println("Conteudos incritos Ana " + devAna.getConteudosInscritos());
        System.out.println("XP adquirido: " + devAna.calcularTotalXp());

        System.out.println("Conteudos concluidos Ana: " + devAna.getConteudosConcluidos());
    }
}
