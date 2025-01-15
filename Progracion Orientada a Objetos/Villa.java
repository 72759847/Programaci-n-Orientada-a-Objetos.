import java.util.ArrayList;
import java.util.List;
public class Villa
{
    private List<Poblador>  pobladores = new ArrayList<>();

    // Método para añadir pobladores
    public void addPoblador(Poblador poblador){
        pobladores.add(poblador);
    }
    //Método para obtener la cantidad de pobladores
    public int getCantidadPobladores(){
        return pobladores.size();
    }
    // Método para obtener la lista de pobladores
    public List<Poblador> getPobladores(){
        return pobladores;
    }

    // Método para buscar un Poblador por nombre
    public Poblador buscarPoblador(String nombre){
        for(Poblador poblador: pobladores){
            if(poblador.getNombre().equals(nombre)){
                return poblador;
            }

        }
        return null; // No encomtrado
    }
}
