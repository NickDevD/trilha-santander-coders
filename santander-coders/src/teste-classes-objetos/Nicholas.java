public class Nicholas {

//Caracetrísticas da classe criada / não atribuir valores
    public String nome;
    public String cor;
    public double altura;
    public float peso;
    public int idade;
    public String formação;
    public String saude;

    //método

    public Nicholas(){}

    public Nicholas(String nome, String cor, double altura, float peso, int idade, String formação, String saude){

    }
    
    public String getNome(){
        return "Carlos";
    }
    
    public String correr(){;
        return "Cansaco";
    }
    
    public String exercitar(String acao){
        if(acao.equals("caminhar")){
        this.saude = "saudavel";
    }else{
        this.saude = "sedentario";
    }
        return saude;
    }
}
