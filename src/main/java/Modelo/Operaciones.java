package Modelo;
/**
 * @author cristian
 */

public class Operaciones {
    private int primerNumero;
    private int segunndoNumero;
    private int resultado ;
    
    /*
    *Constructor vacio
    */
    public Operaciones() {
    }
    
    /** Metodo que regresa el valor del primer numeto
     * @return primerNumero
    */
    public int getPrimerNumero() {
        return primerNumero;
    }

    /** Metodo que establece el valor del primar numero
     * @param primerNumero
     */
    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }
    
    /* Metodo que regresa el valor del segundo numeto
     * @return segundoNumero
    */
    public int getSegundoNumero() {
        return segunndoNumero;
    }

    /** Metodo que establece el valor del segundo numero
     * @param segundoNumero
     */
    public void setSegundoNumero(int segundoNumero) {
        this.segunndoNumero = segundoNumero;
    }
    
    /* Metodo que regresa el resultdo de una operacion
     * @return resultado
    */
    public int getResultado() {
        return resultado;
    }

    /** Metodo que establece el valor del resultado de una operacion
     * @param resultado
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    /*
    *Metodo que llama los valores de los dos numeros y los suma
    */
    public int sumar(){
        this.resultado = this.primerNumero + this.segunndoNumero ;
        return this.resultado ;
    }
    
    /*
    *Metodo que llama los valores de los dos numeros y los resta
    */
    public int restar(){
        this.resultado = this.primerNumero - this.segunndoNumero ;
        return this.resultado ;
    }
    
    /*
    *Metodo que llama los valores de los dos numeros y los multiplica
    */
    public int multiplicar(){
        this.resultado = this.primerNumero * this.segunndoNumero ;
        return this.resultado ;
    }
    
    /*
    *Metodo que llama los valores de los dos numeros y los divide
    */
    public int dividir(){
        this.resultado = this.primerNumero / this.segunndoNumero ;
        return this.resultado ;
    }


    
}



