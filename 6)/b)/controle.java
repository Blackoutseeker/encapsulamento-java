package atividades;
public class controle implements Controlador {
    private String linguagem;
    public void escolherLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
    public void programar() {
        System.out.println("Programando em " + this.linguagem + "...");
    }
    private void escolherOutraLinguagem(String ling) {
        this.linguagem = ling;
    }
    public void novaLinguagem(String ling) {
        escolherLinguagem(ling);
    }
    public String retornarLinguagem() {
        return linguagem;
    }
}
