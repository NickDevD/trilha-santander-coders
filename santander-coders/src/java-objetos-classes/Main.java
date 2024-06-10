public class Main {
    
    public static void main(String[] classeCachorro) {

        //Referenciando a classe para criar o objeto
        ClasseCachorro cachorro1;
        cachorro1 = new ClasseCachorro();
        //ou ClasseCachorro cachorro1 = new ClasseCachorro();

        //Atribuindo valores as características do objeto
        cachorro1.nome = "Dog";
        cachorro1.cor = "Marron";
        cachorro1.altura = 25;
        cachorro1.peso = 5.5;
        cachorro1.tamanhoDoRabo = 5;
       

        //Métodos do objeto / Ações ou atividades realizadas
        cachorro1.latir();
        cachorro1.comer();
        //Neste caso é necessário o "SysOut" pois o método retorna um tipo string que foi atribuído na classe
        //Basta colocar o método dentro dos parênteses para imprimir o retorno tipo string atribuído. 
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        //Neste caso o "SysOut" retontou o valor de estadoDeEspirito do cachorro atribuido nas características
        //No "Sysout" é necessário colocar todo o valor objeto + ação (cachorro1.interagir) e informar qual ação
        //foi feita, caso "carinho"
        System.out.println("O cachorro ficou " + cachorro1.interagir("Vai dormir"));
        System.out.println("O cachorro ficou " + cachorro1.interagir("nada"));
        System.out.println("O cachorro ficou " + cachorro1.interagir("Carinho"));



        
    }
}
