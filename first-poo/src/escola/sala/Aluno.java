package escola.sala;

public class Aluno {
    private String nome;
    private String numeroMatricula;
    private String turma;
    
    public Aluno(String nome, String numeroMatricula){
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }
    
    public String getNome() {
        return nome;
    }
    public String getNumeroMatricula() {
        return numeroMatricula;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }


    
}
