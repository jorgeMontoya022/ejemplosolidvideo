package co.edu.uniquindio.poo;

public class EmpleadoRegular extends Empleado implements pagoEmpleadoI{

    public EmpleadoRegular(String nombreEmpleado, int salario) {
        super(nombreEmpleado, salario);
        
    }

    @Override
    public int calcularPago(Empleado empleado) {
        int pago = (int) (empleado.getSalario()*0.15);
        return pago;
    }
    
}
