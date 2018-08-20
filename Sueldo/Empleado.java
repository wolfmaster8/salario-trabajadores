
/**
 * Write a description of class Empleado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Empleado {
    
    String nombre ;
    int sueldo;
    int horasExtra;
    
public String getNombre() {
        return nombre;
    }

public void setNombre(String nombre ) {
        this.nombre = nombre ;
    }
    
public int getSueldo() {
        return sueldo;
    }
    
public void setSueldo(int sueldo ) {
        this.sueldo = sueldo ;
    }
    
public int getHorasExtra() {
        return horasExtra;
    }   
    
public void setHorasExtra(int horasExtra ) {
        this.horasExtra = horasExtra ;
    }

public Empleado(String nombre,int sueldo,int horasExtra){
this.nombre = nombre ;
this.sueldo = sueldo ;
this.horasExtra = horasExtra;
}

}    
    
    
