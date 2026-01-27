package herenciarpg.personajes;

public class Guerrero extends Personaje {
    private static final int ATAQUE=25;
    private static final int DEFENSA=15;
    private static final String CLASE="Guerrero";
    
    public Guerrero(String nombre) {
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
