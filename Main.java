import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Conteudo;

public class Main{
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescrica("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescrica("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescrica("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescrica("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVanessa = new Dev();
        devVanessa.setNome("Vanessa");
        devVanessa.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Vanessa" + devVanessa.getConteudosInscritos());
        devVanessa.progredir();
        devVanessa.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos Vanessa" + devVanessa.getConteudosInscritos());
        System.out.println("Conteudo Concluidos Vanessa" + devVanessa.getConteudosConcluidos());
        System.out.println("XP:" + devVanessa.calcularTotalXp());
        
        System.out.println("--------");
        
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Joao" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos Joao" + devJoao.getConteudosInscritos());
        System.out.println("Conteudo Concluidos Joao" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}