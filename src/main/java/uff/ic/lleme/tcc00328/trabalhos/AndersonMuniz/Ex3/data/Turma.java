
package uff.ic.lleme.tcc00328.trabalhos.AndersonMuniz.Ex3.data;

public class Turma {
    
    private String codigo;
    private Disciplina disciplina;
    private String horario;
    private String semestre;    
    private Professor professor;
    
    private Turma(){
        
    }
    
    public Turma(String codigo, Disciplina disciplina, 
            String horario, String semestre){
        
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.horario = horario;
        this.semestre = semestre;
        
    }
    
    public String getCodigo(){
        return codigo;
        
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
        
    }
    
    public Disciplina getDisciplina(){
        return disciplina;
        
    }
    
    public String getHorario(){
        return horario;
        
    }
    
    public void setHorario(String horario){
        this.horario = horario;
        
    }
    
    public String getSemestre(){
        return semestre;
        
    }
    
    public void setSemestre(String semestre){
        this.semestre = semestre;
        
    }
    
    public Professor getProfessor(){
        return professor;
        
    }
    
    public void setProfessor(Professor professor){
        this.professor = professor;
        
    }
}
