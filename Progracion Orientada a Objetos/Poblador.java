
/**
 * Write a description of class Poblador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poblador
{// atributos 
    private String nombre;
    private Parque parqueFrecuentado;
    // coonstructor
    public Poblador(String nombre,Parque parqueFrecuentado){
        this.nombre = nombre;
        this.parqueFrecuentado = parqueFrecuentado;
    }

    // Método para presentarse
    public String presentarse(){
        return "Hola, mi nombre es " + nombre + " y frecuento en el parque " + 
        parqueFrecuentado.getNombre() + ".";
    }

    // Método getter para los atributos
    public String getNombre(){
        return nombre;
    }
    
    public Parque getParqueFrecuentado(){
    return parqueFrecuentado;
    }
}
