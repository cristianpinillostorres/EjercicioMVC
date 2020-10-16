/**
 *
 * @author cristian
 */

import Controlador.VistaCalculadoraControlador;
import Modelo.Operaciones;
import Vista.VistaCalculadora;

public class Main {
    
        public static void main(String[] args) {
            //instancia de las clases modelo vista y controlador
            Operaciones modelo = new Operaciones();
            VistaCalculadora vista = new VistaCalculadora();
            VistaCalculadoraControlador controlador = new VistaCalculadoraControlador(vista,modelo);
            
            //llama el metodo que inicia la vista en el controlador
            controlador.iniciarVista();
            
            //perimirit que la vista sea visible
            vista.setVisible(true);
    }
}
