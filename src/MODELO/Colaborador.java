
package MODELO;


public class Colaborador extends Persona {
    private int horas;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public Colaborador(String documento, String nombre, String apellido, int edad, String direccion, String tipo) {
        super(documento, nombre, apellido, edad, direccion, tipo);
    }
    
    @Override
     public void Presentarse(){
     System.out.println("Hola soy "+getNombre()+" "+getApellido());
    }
    
}
