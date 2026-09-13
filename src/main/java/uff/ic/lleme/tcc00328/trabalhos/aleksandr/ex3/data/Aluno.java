package uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex3.data;

public class Aluno {
    
    private String matricula;
    private String nome;
    private String email;

    private Aluno(){
    }
    
    public Aluno(String nome, String matricula, String email){
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


