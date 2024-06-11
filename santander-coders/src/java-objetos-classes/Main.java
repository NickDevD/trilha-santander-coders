public class Main {
    
    public static void main(String[] classeCachorro) {

        //Referenciando a classe para criar o objeto
        //ClasseCachorro cachorro1;
        //cachorro1 = new ClasseCachorro();
        
        ClasseCachorro cachorro1 = new ClasseCachorro("lili", "marron", 25, 5.5, 5);
        //ou ClasseCachorro cachorro1 = new ClasseCachorro();
        ClasseCachorro cachorro2 = new ClasseCachorro("lili", "marron", 25, 5.5, 5);
        

        //Atribuindo valores as características do objeto
        
        //Utilizando método get e set
        cachorro1.getNome();
        cachorro1.setNome("lili");
        cachorro1.setCor("Marron");
        
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

        //"SysOut" do método set com condicional
        System.out.println(cachorro1.setNome("lili"));

        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());

        //Foi criado 2 objeto "cachorro" diferentes
        System.out.println(cachorro1.peso);
        System.out.println(cachorro2.toString());
        
    }
}
