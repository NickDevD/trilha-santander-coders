public class objetoAda {

    public static void main(String[] objetoAda) {
        
        Ada ada1 = new Ada();

        ada1.nome = "AdaTech";
        ada1.curso = "Java";
        ada1.nota = 9;

        ada1.estudar();
        ada1.praticar();

        System.out.println("Conseguir " + ada1.codar());

        System.out.println(ada1.interagir("Duro"));
    }
    
}
