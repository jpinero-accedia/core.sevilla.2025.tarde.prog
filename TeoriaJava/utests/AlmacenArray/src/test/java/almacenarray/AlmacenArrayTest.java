package almacenarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class AlmacenArrayTest {

    //@Disabled
    @Test
    public void anyadir_null () {
        AlmacenArray<Integer> datos = new AlmacenArray<>();
        datos.anyadir(null);
        
        Integer el = datos.obtener(0);
        Assertions.assertNull(el);
    }
    
    //@Disabled
    @Test
    public void anyadir_nonull () {
        AlmacenArray<Integer> datos = new AlmacenArray<>();
        datos.anyadir(5);
        
        Integer el = datos.obtener(0);
        Assertions.assertEquals(Integer.valueOf(5),el);
    }

    //@Disabled
    @Test
    public void anyadir_varios_valores () {
        AlmacenArray<Integer> datos = new AlmacenArray<>();
        datos.anyadir(5);
        datos.anyadir(6);
        
        Integer el = datos.obtener(0);
        Assertions.assertEquals(Integer.valueOf(5),el);
        
        el = datos.obtener(1);
        Assertions.assertEquals(Integer.valueOf(6),el);
    }
    
    //@Disabled
    @Test
    public void tamanyo_vacio () {
        AlmacenArray<Integer> datos = new AlmacenArray<>();
        
        int size = datos.tamanyo();
        
        Assertions.assertEquals(0,size);
    }
    
    //@Disabled
    @Test
    public void tamanyo_novacio () {
        AlmacenArray<Integer> datos = new AlmacenArray<>();
        datos.anyadir(67);
        datos.anyadir(7);
        datos.anyadir(6799);
        
        int size = datos.tamanyo();
        
        Assertions.assertEquals(3,size);
    }
    
    //@Disabled
    @Test
    public void obtener_vacia () {
        AlmacenArray<Integer> datos = new AlmacenArray<>();
        Assertions.assertThrowsExactly(IndexOutOfBoundsException.class,()->datos.obtener(0));
    }
    
    //@Disabled
    @Test
    public void obtener_primero () {
        AlmacenArray<Integer> datos = new AlmacenArray<>();
        datos.anyadir(5);
        datos.anyadir(6);
        datos.anyadir(9);
        
        Integer el = datos.obtener(0);
        Assertions.assertEquals(Integer.valueOf(5),el);
    }
    
        //@Disabled
    @Test
    public void obtener_ultimo () {
        AlmacenArray<Integer> datos = new AlmacenArray<>();
        datos.anyadir(5);
        datos.anyadir(6);
        datos.anyadir(9);
        
        Integer el = datos.obtener(2);
        Assertions.assertEquals(Integer.valueOf(9),el);
    }
    
    //@Disabled
    @Test
    public void obtener_enmedio () {
        AlmacenArray<Integer> datos = new AlmacenArray<>();
        datos.anyadir(5);
        datos.anyadir(6);
        datos.anyadir(9);
        
        Integer el = datos.obtener(1);
        Assertions.assertEquals(Integer.valueOf(6),el);
    }
    
    //@Disabled
    @Test
    public void obtener_novacio_index_out () {
        AlmacenArray<Integer> datos = new AlmacenArray<>();
        datos.anyadir(5);
        datos.anyadir(6);
        datos.anyadir(9);
        
        Assertions.assertThrowsExactly(IndexOutOfBoundsException.class,()->datos.obtener(3));
    }
}
