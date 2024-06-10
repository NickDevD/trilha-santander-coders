public class Ada {

    String nome;
    String curso;
    int nota;
    String codar;
    
    
    public void estudar(){
        System.out.println("Desenvolver-se");
    }

    public void praticar(){
        System.out.println("Aprender");
    }

    public String codar(){
        return "Hackear Sistemas";
    }

    public String interagir(String acao){
        
        //swicth case break é útil para resumir casos de "else if"
        switch (acao) {
            case "Fofo": this.codar = "Fracassado";
            break;
            case "Duro": this.codar = "Otimizado";
            break;
            default: this.codar = "Neutro"; 
            break; 
        }
        return codar;
    }
    
}
