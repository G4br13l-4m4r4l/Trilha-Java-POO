import escola.diretoria.Diretor;
import escola.sala.Aluno;
import escola.sala.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("Fulano", "12314");
        Professor prof1 = new Professor("Beltrano");
        Diretor diretor = new Diretor("Meltrano");

        aluno1.setTurma("nono ano");
        prof1.setMateria("Física");
        diretor.setTurmasResponsaveis("nono ano");

        System.out.println("Aluno: "+aluno1.getNome()+", número de matricula: "+aluno1.getNumeroMatricula()+", matriculado na turma: "+aluno1.getTurma());
        System.out.println("Professor: "+prof1.getNome()+", responsavel pela materia: "+prof1.getMateria());
        System.out.println("Diretor: "+diretor.getNome()+", sera responsavel pela turma do "+diretor.getTurmasResponsaveis());

    }
}
