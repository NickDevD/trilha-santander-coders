package builder.problem;

import builder.solution.Pessoa;

public class TestePessoa {
    
    public static void main(String[] args) {
      
        //Objeto pessoa criado baseado na classe pessoa e aplicado os construtores
        Pessoa pessoa = new Pessoa("Nicholas", 
        "Monteiro", 
        "RG", 
        "nick.developerDev@gmail.com", 
        "Nick", "19/02/1994");

        System.out.println(pessoa);


        //Stringbuilder permite imprimir os atributos
        StringBuilder sb = new StringBuilder().append("Nick ").append("Monteiro");
        System.out.println(sb);

    }
}
