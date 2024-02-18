package co.edu.uniquindio.poo;

public class Empleado {
    private String nombreEmpleado;
    private int salario;

    public Empleado(String nombreEmpleado, int salario) {
        this.nombreEmpleado = nombreEmpleado;
        this.salario = salario;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    
}
