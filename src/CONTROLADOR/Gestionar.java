
package CONTROLADOR;

import MODELO.Beneficiario;
import MODELO.Colaborador;
import MODELO.Empleado;
import java.util.Scanner;


public class Gestionar extends GestionarAbstracto {
    Colaborador c;
    Empleado e;
    Beneficiario b;
    
    public void menu(){
        int op = 0;
        do{
           System.out.println("""
                               1. Registrar Persona
                               2. Ver persona
                               3. salir
                               """);
            op = new Scanner(System.in).nextInt();
            while (op < 1 || op > 4) {
                System.out.println("Opcion no valida. ");
                System.out.println("""
                               1. Registrar Persona
                               2. Ver persona
                               3. salir
                               """);
                op = new Scanner(System.in).nextInt();

            }
            switch (op) {
                case 1:
                    registrar();
                    break;
                case 2:
                    VerPersona();
                    break;
            }

        } while (op != 3);
    }

    public void registrar() {
        String tipo;
        int hora = 0;
        int cantidad = 0;
        String horario = "";
        System.out.println("============Inicio de Registro=========");
        System.out.println("Ingresa nombre : ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Ingresa el apellido: ");
        String apellido = new Scanner(System.in).nextLine();
        System.out.println("Ingresa la direccion : ");
        String direccion = new Scanner(System.in).nextLine();
        System.out.println("Ingresa el documento : ");
        String documento = new Scanner(System.in).nextLine();
        System.out.println("edad : ");
        int edad = new Scanner(System.in).nextInt();
        System.out.println("Ingresa que tipo de persona es: \n1. Empleado\n2. Colaborador\n3.Beneficiario");
        int op = new Scanner(System.in).nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingresa los datos para el empleado");
                System.out.println("Ingresa el salario: ");
                int salario = new Scanner(System.in).nextInt();
                System.out.println("Ingresa el horario en que trabaja: ");
                System.out.println("""
                                   1. 8-5pm
                                   2. 2-11pm
                                   """);
                int hora2 = new Scanner(System.in).nextInt();
                switch (hora2) {
                    case 1:
                        horario = "8-5 pm";
                        break;
                    case 2:
                        horario = "2-11 pm";
                        break;
                }
                tipo = "Empleado";
                e = new Empleado(documento,  nombre,  apellido,  edad,  direccion,  tipo);
                break;
            case 2:
                System.out.println("ingrese las horas que desea trabajar");
                hora = new Scanner(System.in).nextInt();
                while (hora > 25 || hora < 0) {
                    System.out.println("hora no valida ,maximo 25 horas por mes");
                    hora = new Scanner(System.in).nextInt();

                }
                tipo = "Colaborador";
                c = new Colaborador(documento,  nombre, apellido,  edad,  direccion, tipo);
                System.out.println("Registrado");
                break;
            case 3:
                tipo ="Beneficiario";
                 System.out.println("cuantas ayudas tuvo este mes ");
                cantidad = new Scanner(System.in).nextInt();
                while (cantidad > 5 || cantidad < 0) {
                    System.out.println("error hora no establecida dentro de rango maximo de horas");
                    cantidad = new Scanner(System.in).nextInt();

                }
                b= new Beneficiario(documento,  nombre,  apellido,  edad,  direccion,  tipo);
                System.out.println("Registrado");
                break;
                
        }

    }

    private void VerPersona() {
        if (e != null) {
        System.out.println("Empleado: " + e.getNombre());
    }

    if (c != null) {
        System.out.println("Colaborador: " + c.getNombre());
    }

    if (b != null) {
        System.out.println("Beneficiario: " + b.getNombre());
    }

    if (e == null && c == null && b == null) {
        System.out.println("No hay personas registradas");
    }

    }

}