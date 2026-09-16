/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uff.ic.lleme.tcc00328.trabalhos.esther.ex4.data;

/**
 *
 * @author aluno
 */
public class Dado {
    
    private int face;
    private int identificador;
    
    public Dado (int face, int identificador){
        this.face= face;
        this.identificador = identificador;
    }

    /**
     * @return the face
     */
    public int getFace() {
        return face;
    }

    /**
     * @param face the face to set
     */
    public void setFace(int face) {
        this.face = face;
    }

    /**
     * @return the identificador
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    

}

