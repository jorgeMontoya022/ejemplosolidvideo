package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class GestionarEmpleado {
    private Collection<Empleado>empleados;

    public GestionarEmpleado() {
        this.empleados = new LinkedList<>();
    }

    public Collection<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Collection<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleados(Empleado empleado){
        empleados.add(empleado);

    }

 
}
