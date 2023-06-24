import java.util.ArrayList;
import java.util.List;

public class Listado {

    List<Corredora> lista;
    public Listado(){

        this.lista = new ArrayList<Corredora>();

    }

    public void agregarDato( Corredora co ){
        this.lista.add(co);
    }

    public void desplegarLista(){

        for ( Corredora el : lista
        ) {

            el.mostrarDatos();


        }

    }

}
