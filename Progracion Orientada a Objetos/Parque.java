
/**
 * Write a description of class Parque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parque
{
    // atributos
    private String nombre;
    // constructor
    public Parque(String nombre){
        this.nombre = nombre;
    }
    // Método para obtener nombre
    public String getNombre(){
        return nombre;
    }

    // Método para cambiear el nombre del parque
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
