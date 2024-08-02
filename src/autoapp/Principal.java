
package autoapp;

/**
 *
 * @author Kenneth
 */
public class Principal {

public static void main(String[] args) {
        // Crear un objeto Auto
        Auto miAuto = new Auto("Toyota", "Negro", "Pick Up", "Tacoma", 5);

        // Mostrar la información del auto
        miAuto.mostrarInformacion();

        // Modificar algunos atributos
        miAuto.setColor("Negro");
        miAuto.setModelo("Tacoma");

      }
}

    