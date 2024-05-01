package escola.diretoria;

public class Diretor {
    private String nome;
    private String turmasResponsaveis;
    
    public Diretor(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    public String getTurmasResponsaveis() {
        return turmasResponsaveis;
    }
    public void setTurmasResponsaveis(String turmasResponsaveis) {
        this.turmasResponsaveis = turmasResponsaveis;
    }
    
}
