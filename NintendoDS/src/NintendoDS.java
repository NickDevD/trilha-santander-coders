public class NintendoDS {
    
    //características
    String modelo;
    String marca;
    String jogo = "Mario Kart";
    boolean ligado = true;
    int volume = 10;

    //Métodos
    
    public void ligar(boolean ligado){
        ligado = true;
        System.out.println("Sistema iniciado");
          
    }
    public void desligar(boolean ligado){
        ligado = false;
        System.out.println("Sistema deligado");
    }
    
    void escolherModelo(String modelo){
        System.out.println("O modelo e " + modelo);
        
    }
    void escolherMarca(String marca){
        System.out.println("A marca escolhida e " + marca);

    }

    void aumentarVolume(int volume){
        volume++;
    }
    
}
