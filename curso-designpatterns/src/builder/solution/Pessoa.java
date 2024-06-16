package builder.solution;

public class Pessoa {

    //Características
    private String nome;
    
    private String sobreNome;

    private String documento;

    private String email;

    private String apelido;

    private String dataNascimento;

    //CONSTRUTORES
    public Pessoa(String nome, String sobreNome, String documento, String email, String apelido, String dataNascimento) {
            this.nome = nome;
            this.sobreNome = sobreNome;
            this.documento = documento;
            this.email = email;
            this.apelido = apelido;
            this.dataNascimento = dataNascimento;

    }

    //GETS AND SETS
    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getSobreNome() {return sobreNome;}

    public void setSobreNome(String sobreNome) {this.sobreNome = sobreNome;}

    public String getDocumento() {return documento;}

    public void setDocumento(String documento) {this.documento = documento;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getApelido() {return apelido;}

    public void setApelido(String apelido) {this.apelido = apelido;}

    public String getDataNascimento() {return dataNascimento;}
    
    public void setDataNascimento(String dataNascimento) {this.dataNascimento = dataNascimento;}


    @Override
    public String toString() {
        return "Pessoa{" +
        "nome'" + nome + '\'' +
        ", sobreNome='" + sobreNome + '\'' +
        ", documento='" + documento + '\'' +
        ", email='" + email + '\'' +
        ", apelido='" + apelido + '\'' +
        ", dataNascimento='" + dataNascimento + '\'' +
        '}';
    }

    

}
