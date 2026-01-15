
package MODELO;


public class Beneficiario extends Persona {
     private int ayudasM;

    public int getAyudasM() {
        return ayudasM;
    }

    public void setAyudasM(int ayudasM) {
        this.ayudasM = ayudasM;
    }
     
    public Beneficiario(String documento, String nombre, String apellido, int edad, String direccion, String tipo) {
        super(documento, nombre, apellido, edad, direccion, tipo);
    }
    
     @Override
     public void Presentarse(){
     System.out.println("Hola soy "+getNombre()+" "+getApellido());
    }
    
}
