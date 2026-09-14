package uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex3.data;

public class Disciplina {
    
    private String codigo;
    private String carga;
    private String nome;
    private String ementa;
    
    private Disciplina (){
    }
    
    public Disciplina (String codigo, String carga, String nome, String ementa){
        this.nome = nome;
        this.carga = carga;
        this.ementa = ementa;
        this.codigo = codigo;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the carga
     */
    public String getCarga() {
        return carga;
    }

    /**
     * @param carga the carga to set
     */
    public void setCarga(String carga) {
        this.carga = carga;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ementa
     */
    public String getEmenta() {
        return ementa;
    }

    /**
     * @param ementa the ementa to set
     */
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
}
