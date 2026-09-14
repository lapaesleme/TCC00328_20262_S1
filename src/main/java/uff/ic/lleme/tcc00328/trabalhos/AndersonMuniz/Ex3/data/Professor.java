
package uff.ic.lleme.tcc00328.trabalhos.AndersonMuniz.Ex3.data;

public class Professor {
    
    private String matricula;
    private String nome;
    private String departamento;
    private String email;
    
    private Professor(){
        
    }
    
    public Professor(String matricula, String nome,
            String departamento, String email){
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
        this.email = email;
        
    }
    
    public String getMatricula(){
        return matricula;
        
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
        
    }
    
    public String getNome(){
        return nome;
        
    }
    
    public void setNome(String nome){
        this.nome = nome;
        
    }
    
    public String getDepartamento(){
        return departamento;
        
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
        
    }
    
    public String getEmail(){
        return email;
        
    }
    
    public void setEmail(String email){
        this.email = email;
        
    }
    
}
    

