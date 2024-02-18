package co.edu.uniquindio.poo;

public class EmpleadoProgramador extends Empleado implements TrabajoProgramadorI {

    public EmpleadoProgramador(String nombreEmpleado, int salario) {
        super(nombreEmpleado, salario);

    }

    @Override
    public void realizarProyecto() {
       System.out.println("verificar como será el proyecto");
    }

    @Override
    public void codificar() {
       System.out.println("codificar el proyecto");
    }

    @Override
    public void probar() {
       System.out.println("probar el proyecto codificado");
    }
}
