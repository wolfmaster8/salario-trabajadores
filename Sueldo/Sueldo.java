
/**
 * 
 * @authors Felipe Lobo, Alexis Chacon, Sergio Baron, Pablo Roman
 * @version 0.2a
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Sueldo
{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        boolean menu1 = true;
        boolean menu2 = false;
        
        String nombre;
        int edad, opcion;
        int contador = 1;
        double sueldo, horasExtra;
        
        //Array opara guardar los datos del empleado
        ArrayList<Empleado> empleados = new ArrayList();
        
        //System.out.println();
        System.out.println("-----Bienvenido-----\n---Sistema de Control de Salarios---");
        //Primer Menu
        while(menu1){
           System.out.println("------\nSelecciona:\n1. Modificar Trabajador Existente\n2.Agregar Horas Extra a un Trabajador\n3. Mostrar Total a Pagar Empleados\n4. Salir");
        }
        
    }
}
