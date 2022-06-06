
package hospitalespais;

public class Enfermero {
     private String nombre;
    private String tipo;
    private double sueldo;
    
    public Enfermero(String nom, String t, double s) {
        nombre = nom;
        tipo = t;
        sueldo = s;
    }
    
    public void establecerNombre(String x) {
        nombre = x;
    }
    
    public void establecerTipo(String x) {
        tipo = x;
    }
    
    public void establecerSueldo(double x) {
        sueldo = x;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerTipo() {
        return tipo;
    }
    
    public double obtenerSueldo() {
        return sueldo;
    }
}

