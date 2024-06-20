package builder.solution;



public class Animal {

    String nome;
    String raca;
    String dono;
    

    public Animal(String nome, String raca, String dono){
        this.nome = nome;
        this.raca = raca;
        this.dono = dono;
    }

    public String getNome() {return nome;}

        public void setNome(String nome) {this.nome = nome;}

    public String getRaca() {return raca;}

        public void setRaca(String raca) {this.raca = raca;}

    public String getDono() {return dono;}

        public void setDono(String dono) {this.dono = dono;}
}
