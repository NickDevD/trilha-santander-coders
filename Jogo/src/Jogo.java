//Importar Classe PrintStream/Random/Scanner
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        
        //Objeto criado com a classe PrintStream/Scanner e Random
        //A classe PrintStream possui o argumento System.out
        PrintStream show = System.out;
        Scanner scan = new Scanner(System.in);
        //Objeto gerador do número aleatório
        Random gerador = new Random();
        
        int opcao;
        int escolha_computador;
        int escolhar_usuario;

        show.println("Olá! Qual o seu nome?");
        String nome = scan.nextLine();
        show.println("Prazer em conhece-lo " + nome+"!");
        show.println("\nInforme o número da sua opção. \n1 ->");
        opcao = scan.nextInt();

        if(opcao == 2){
            show.println("Que pena!Mas tudo bem, fica para a próxima");

        }else if(opcao == 1){

            show.println("Ok! o jogo é assim");
            show.println();
        }

    }
    
}
