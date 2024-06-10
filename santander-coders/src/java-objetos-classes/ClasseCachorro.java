public class ClasseCachorro {
    
    //Características da classe cachorro

    //Encapsulamento Ex - PRIVATE
    private String nome;
    private String cor;

    //Ex - PUBLIC
    public int altura;
    public double peso;
    public int tamanhoDoRabo;
    
    //Característica criada para definir uma ação
    public String estadoDeEspirito;

    //CONSTRUTORES
    public ClasseCachorro(){}
    
    
    public ClasseCachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
        
    }

    //Método get - utilizado para criar uma regra específica para o objeto que desejar
    //Pode proibir o acesso ou alterar o retorno
    //Neste exemplo foi alterado o retorno
    public String getNome(){
        return "rex";
    }

    public double getPeso(){
        return 5.5;
    }
    //Set com condicional
    public String setNome(String nome){
        if(nome.equals("lili")){
        }
        return "Nome Feio";
    }

    //Método set
    public void setCor(String cor){
        this.cor = cor;
    }
    
    //Métodos
    //Exemplo 1 - método publico / sem retorno (void) / Ação "comer" / não recebe variável () / não faz nada {}
    public void comer(){}

    //Exemplo 2 - neste exemplo o método há uma atribuição que seria o latido
    public void latir(){
        System.out.println("Au,au");
    }
    //Exemplo 3 - neste exemplo atribuímos um retorno do TIPO string
    public String pegar() {
        //Importante colocar qual retorno ele dará
        return "bolinha";
    }

    //Exemplo 4 - Neste exemplo foi adicionado alguns termos 
    //equals - utilizado para comparar / 
    //IF/ELSE - condicionais 
    //this - utilizado para vincular uma única variável
    // O método criado foi uma ação tipo string interagir (String acao) com condicionais
    public String interagir(String acao){
        if(acao.equals("Carinho")){
            this.estadoDeEspirito = "Feliz";
        
        //(ELSE IF) Seria mais uma ação adicionada para o objeto realizar e ter um retorno         
        }else if(acao.equals("Vai dormir")){
            this.estadoDeEspirito = "tristonho";
        }else{
            this.estadoDeEspirito = "neutro";
        }
            return estadoDeEspirito;
    }


}
