
/**
 * Write a description of class Empleado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Empleado {
    
    String nombre ;
    int sueldo, tipo;
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
    
public String getTipo(){
    
    if(tipo == 1){
        return "Ingeniero";
    }else if(tipo == 2){
        return "Arquitecto";
    }else if(tipo == 3){
        return "Obrero";
    }else{
        return "Error";
    }
}

public void setTipo(int tipo){
    this.tipo = tipo;
}

public Empleado(String nombre,int sueldo, int tipo,int horasExtra){
this.nombre = nombre ;
this.sueldo = sueldo ;
this.horasExtra = horasExtra;
this.tipo = tipo;
}

}    
    
    
