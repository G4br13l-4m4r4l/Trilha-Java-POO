package Veiculos;

public class Carro extends Veiculo {
    private boolean ligado =false;
    private int combustivel = 100;
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar(){
        if(isLigado()){
            System.out.println("Carro ligado!");
            return;
        }else{
            checarCombustivel();
        }
    }

    private void checarCombustivel(){
        if(combustivel>20){
            System.out.println("Ainda tem combustivel suficiente!");
            injetarCombustivel();
        }else{
            System.out.println("Precisa abastecer!");
        }
    }
    private void injetarCombustivel(){
        setLigado(true);
        ligar();
    }
}
