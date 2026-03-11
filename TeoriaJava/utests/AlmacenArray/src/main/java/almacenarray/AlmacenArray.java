package almacenarray;

import java.util.ArrayList;

public class AlmacenArray<E> {
    private final ArrayList<E> datos;
    
    public AlmacenArray () {
        datos = new ArrayList<>();
    }
    
    public void anyadir (E elemento) {
        datos.add(elemento);
    }
    
    public E obtener (int pos) {
        return datos.get(pos);
    }
    
    public int tamanyo () {
        return datos.size();
    }
}
