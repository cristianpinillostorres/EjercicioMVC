/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author cristian
 */
public class Operaciones {
    private int primerNumero;
    private int segunndoNumero;
    private int resultado ;
    
    public Operaciones() {
    }

    public int getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }

    public int getSegunndoNumero() {
        return segunndoNumero;
    }

    public void setSegunndoNumero(int segunndoNumero) {
        this.segunndoNumero = segunndoNumero;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public int sumar(){
        this.resultado = this.primerNumero + this.segunndoNumero ;
        return this.resultado ;
    }
    
    public int restar(){
        this.resultado = this.primerNumero - this.segunndoNumero ;
        return this.resultado ;
    }
    
    public int multiplicar(){
        this.resultado = this.primerNumero * this.segunndoNumero ;
        return this.resultado ;
    }
    
    public int dividir(){
        this.resultado = this.primerNumero / this.segunndoNumero ;
        return this.resultado ;
    }


    
}



