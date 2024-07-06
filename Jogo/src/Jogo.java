//Importar Classe PrintStream/Random/Scanner
import java.io.PrintStream;
//gerar numeros aleatorios
import java.util.Random;
//capturar dados do usuário
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
        //este objeto permite por meio do metodo "nextLine" capturar strings ou seja respostas do usuario
        String nome = scan.nextLine();
        show.println("Prazer em conhece-lo " + nome+"!");
        show.println("\nInforme o número da sua opção. \n1 ->");
        //neste metodo e possivel capturar numeros inteiros
        opcao = scan.nextInt();

        if(opcao == 2){
            show.println("Que pena!Mas tudo bem, fica para a próxima");

        }else if(opcao == 1){

            show.println("Ok! o jogo é assim");
            show.println("Eu vou escolher um número de 0 a 10");
            show.println("Mas não vou falar para você qual");
            show.println("Se voce conseguir advinhar qual");
            show.println("Você será o vencedor");

            escolha_computador = gerador.nextInt(11);

            show.println("Ok, "+nome+". Eu já escolhi!");
            show.println("Agora tente advinhar!");

            do{
                escolhar_usuario = scan.nextInt();
                if(escolhar_usuario != escolha_computador){

                }else{
                    show.println("Parabéns! Você acertou!");
                }
            }while(escolha_computador != escolhar_usuario);

        }

    }
    
}
