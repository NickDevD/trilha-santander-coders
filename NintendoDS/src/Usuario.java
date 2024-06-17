public class Usuario {


    public static void main(String[] args) throws Exception {

        NintendoDS nintendods1 = new NintendoDS();

        //System.out.println(nintendods1.modelo);
        //System.out.println(nintendods1.jogo);
        //System.out.println(nintendods1.marca);
        //System.out.println(nintendods1.ligado);

        //Printando um texto + características do objeto 
        System.out.println("Modelo Diponivel: " + nintendods1.modelo);

        System.out.println("Marca Disponivel: " + nintendods1.marca);

        System.out.println("Estado Atual do Console: " + nintendods1.ligado);

        //Printando o método com o paramêtro informado
        nintendods1.escolherModelo("3DS");

        nintendods1.desligar(false);

        nintendods1.ligar(false);

        nintendods1.escolherMarca("sony");

        nintendods1.aumentarVolume(10);
    }
}
