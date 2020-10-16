/**
 *
 * @author cristian
 */

import Controlador.VistaCalculadoraControlador;
import Modelo.Operaciones;
import Vista.VistaCalculadora;

public class Main {
    
        public static void main(String[] args) {
        Operaciones modelo = new Operaciones();
        VistaCalculadora vista = new VistaCalculadora();
        VistaCalculadoraControlador controlador = new VistaCalculadoraControlador(vista,modelo);
        
        controlador.iniciarVista();
        vista.setVisible(true);
    }
}
