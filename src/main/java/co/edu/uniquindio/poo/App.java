package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        EmpleadoProgramador empleadoProgramador = new EmpleadoProgramador("Jorge", 800000);
        EmpleadoRegular empleadoRegular = new EmpleadoRegular("William", 750000);

        GestionarEmpleado gestionarEmpleado = new GestionarEmpleado();
        gestionarEmpleado.agregarEmpleados(empleadoProgramador);
        gestionarEmpleado.agregarEmpleados(empleadoRegular);
    }
}
