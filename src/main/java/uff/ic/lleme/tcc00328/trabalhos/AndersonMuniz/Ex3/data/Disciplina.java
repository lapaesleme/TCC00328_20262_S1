
package uff.ic.lleme.tcc00328.trabalhos.AndersonMuniz.Ex3.data;

public class Disciplina {
    
    private String nome;
    private String codigo;
    private String cargaHoraria;
    private String ementa;
    
    private Disciplina(){
        
    }
    
    public Disciplina(String nome, String codigo, String cargaHoraria, String ementa){
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
        
    }
    
    public String getNome(){
        return nome;
        
    }
    
    public void setNome(String nome){
        this.nome = nome;
        
    }
    
    public String getCodigo(){
        return codigo;
        
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getCargaHoraria(){
        return cargaHoraria;
        
    }
    
    public void setCargaHoraria(String cargaHoraria){
        this.cargaHoraria = cargaHoraria;
        
    }
    
    public String getEmenta(){
        return ementa;
        
    }
    
    public void setEmenta(String ementa){
        this.ementa = ementa;
    }
    
}
