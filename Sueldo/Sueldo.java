
/**
 * 
 * @authors Felipe Lobo, Alexis Chacon, Sergio Baron, Pablo Roman
 * @version 1.2b
 */
import java.util.*;
import java.util.Scanner;
import javax.swing.*;
public class Sueldo
{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        boolean menu = true;
        
        String nombre;
        int opcion;
        int contador = 1;
        int sueldo, horasExtra;
        
        //Array opara guardar los datos del empleado
        List<Empleado> detalles = new ArrayList<>();

        while(menu){
           String entr=JOptionPane.showInputDialog("Bienvenido\nSistema de Control de Salarios\n\nSelecciona:\n1. Crear Empleado\n2. Ver detalles\n3. Mostrar Total a Pagar detalles\n4. Salir");
           opcion = Integer.parseInt(entr); 
           
           switch(opcion){
               case 1:
                    agregarEmpleado(detalles);
                    break;
               case 2:
                    for(Empleado i: detalles){
                        JOptionPane.showMessageDialog(null,i.getNombre()
                        +"\nTipo de Empleado: "+i.getTipo()
                        +"\nSueldo: "+i.getSueldo()
                        +"\nHoras Extra: "+i.getHorasExtra());
                    }
                    break;
                
                case 3:
                    double sueldoTotal;
                    for(Empleado i: detalles){
                        sueldoTotal = (i.getHorasExtra()*7900) + i.getSueldo();
                        JOptionPane.showMessageDialog(null, i.getNombre()
                        +"\nTipo de Empleado: "+i.getTipo()
                        +"\nSueldo Extra: "+i.getHorasExtra()*7900
                        +"\n-----\nSueldo Total: "+ sueldoTotal);
                    }
                    break;
                
                case 4:
                    int resp = JOptionPane.showConfirmDialog(null, "¿Estás seguro?");
                    if(resp== JOptionPane.YES_OPTION){
                        System.exit(0);
                    }
                    break;
               default:
                    JOptionPane.showMessageDialog(null,"Valor no válido","Error",JOptionPane.ERROR_MESSAGE); 
            }
        }
        
    }
    
    public static void agregarEmpleado(List detalles){
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo de empleado:\n1. Ingeniero\n2. Arquitecto\n3. Obrero"));
        String nombre = JOptionPane.showInputDialog("Nombre:");
        //JOptionPane.showMessageDialog(null, nombre);
        int sueldo = Integer.parseInt(JOptionPane.showInputDialog("Sueldo:"));
        int horasExtra = Integer.parseInt(JOptionPane.showInputDialog("Horas Extra"));
        
        detalles.add(new Empleado(nombre, sueldo,tipo, horasExtra));
        JOptionPane.showMessageDialog(null, "Usuario Creado");
        
    }
    
    
}
