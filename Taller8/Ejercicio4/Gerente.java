package Ejercicio4;

class Gerente extends Empleado, Contrato{
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + ", Departamento: " + getDepartamento();
        
    }
}
