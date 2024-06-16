package builder.problem;

import builder.solution.Animal;

public class TesteAnimal {

    public static void main(String[] args){

        Animal animal = new Animal("Rex", "Caramelo", "Nick");

        System.out.println(animal.getNome());
        System.out.println(animal.getDono());
        System.out.println(animal.getRaca());
        
    }
    
}
