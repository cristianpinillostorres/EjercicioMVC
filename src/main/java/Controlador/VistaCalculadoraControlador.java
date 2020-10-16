
package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Operaciones;
import Vista.VistaCalculadora;

/**
 *
 * @author cristian
 */
public class VistaCalculadoraControlador implements ActionListener{
    /**
    * variable  vista de tipo objeto
    * variable modelo de tipo objeto
    */
    private VistaCalculadora vista;
    private Operaciones modelo;
    /**
     * contructor que recibe dos parametros
     * recibe informacion de las clases
     * y la acción del boton 
     * @param vista
     * @param modelo 
     */
    public VistaCalculadoraControlador(VistaCalculadora vista, Operaciones modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.BT_Sumar.addActionListener(this);
        this.vista.BT_Restar.addActionListener(this);
        this.vista.BT_Multiplicar.addActionListener(this);
        this.vista.BT_Dividir.addActionListener(this);
        
        
    }
    
    /**
     * Este metodo es el encargado de la asigacion de valores 
     * a la vista conlos datos del modelo 
     */
    public void iniciarVista(){
       vista.setTitle("EJERCICIO MVC");
       vista.setLocationRelativeTo(null);
    }
    
    /**
     * este metodo es el encargado llamar al metodo iniciarValores 
     * y producir el evento del boton para asignar los valores que 
     * se obtiene en la vista.
     */
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        modelo.setPrimerNumero((Integer.parseInt(vista.TF_Numero1.getText())));
        modelo.setSegunndoNumero((Integer.parseInt(vista.TF_Numero2.getText())));
        
        if (e.getSource()== vista.BT_Sumar){
            vista.L_Resultado.setText(String.valueOf(modelo.sumar()));     
        }
        if (e.getSource()== vista.BT_Restar){
            vista.L_Resultado.setText(String.valueOf(modelo.restar()));     
        }
        if (e.getSource()== vista.BT_Multiplicar){
            vista.L_Resultado.setText(String.valueOf(modelo.multiplicar()));     
        }
        if (e.getSource()== vista.BT_Dividir){
            vista.L_Resultado.setText(String.valueOf(modelo.dividir()));     
        }
        
    }
      
}