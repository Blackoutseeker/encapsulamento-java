package atividades;
import java.util.Scanner;
public class Atividades {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String linguagem;
        controle control = new controle();
        System.out.print("Em qual linguagem você programa? ");
        linguagem = in.next();
        if(linguagem.equals("")) {
            System.out.println("Você não é um programador!");
        }
        else {
            control.escolherLinguagem(linguagem);
            control.programar();
            System.out.print("Você programa em outra linguagem? ");
            linguagem = in.next();
            if(linguagem.equals("") || linguagem.equals("n") || linguagem.equals("não")) {
                System.out.println("Voê programa apenas em " + control.retornarLinguagem());
            }
            else {
                control.novaLinguagem(linguagem);
                control.programar();
            }
        }
    }
}
