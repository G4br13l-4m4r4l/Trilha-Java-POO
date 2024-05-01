package escola.sala;

public class Professor {
    private String nome;
    private String materia;
    
    public Professor(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }


    
}
