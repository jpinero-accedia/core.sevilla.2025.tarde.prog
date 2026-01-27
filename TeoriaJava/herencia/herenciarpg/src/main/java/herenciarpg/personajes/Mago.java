package herenciarpg.personajes;

public class Mago extends Personaje {
    private static final int ATAQUE=30;
    private static final int DEFENSA=5;
    private static final String CLASE="Mago";
    
    public Mago(String nombre) {
        super(nombre);
    }

    @Override
    protected String getClase() {
        return CLASE;
    }

    @Override
    protected int getAtaque() {
        return ATAQUE;
    }

    @Override
    protected int getDefensa() {
        return DEFENSA;
    }  
}
