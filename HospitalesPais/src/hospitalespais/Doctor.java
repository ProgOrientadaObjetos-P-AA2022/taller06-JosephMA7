
package hospitalespais;


public class Doctor {
    private String nombre;
    private String especialidad;
    private double sueldo;
    
    public Doctor(String nom, String ep, double s) {
        nombre = nom;
        especialidad = ep;
        sueldo = s;
    }
    
    public void establecerNombre(String x) {
        nombre = x;
    }
    
    public void establecerEspecialidad(String x) {
        especialidad = x;
    }
    
    public void establecerSueldo(double x) {
        sueldo = x;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerEspecialidad() {
        return especialidad;
    }
    
    public double obtenerSueldo() {
        return sueldo;
    }
} 

