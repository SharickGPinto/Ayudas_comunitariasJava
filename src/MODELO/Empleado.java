
package MODELO;


public class Empleado extends Persona {
    
    private double salario;
    private String horario;
    
    public Empleado(String documento, String nombre, String apellido, int edad, String direccion, String tipo) {
        super(documento, nombre, apellido, edad, direccion, tipo);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    @Override
     public void Presentarse(){
     System.out.println("Hola soy "+getNombre()+" "+getApellido());
    }
    
    
}
