
public class Main
{
    public static void main(String[] args){
        Villa villa = new Villa();
        Parque parque = new Parque("El aguilita");

        Poblador juanPablo = new Poblador("Juan Pablo", parque);
        villa.addPoblador(juanPablo);

        System.out.println("Cantidad de pobladores en la villa: " + villa.getCantidadPobladores());
        for(Poblador poblador: villa.getPobladores()){
            System.out.println(poblador.presentarse());
        }

        // Buscar un poblador por nombre
        Poblador buscado = villa.buscarPoblador("Juan Pablo");
        if(buscado != null){
            System.out.println("Poblador encontrado: " + buscado.presentarse());
        }else{
            System.out.println("Poblador no encontrado");
        }
    }
}
