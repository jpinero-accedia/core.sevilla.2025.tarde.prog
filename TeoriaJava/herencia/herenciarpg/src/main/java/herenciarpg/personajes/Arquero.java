package herenciarpg.personajes;

public class Arquero extends Personaje {
   private static final int ATAQUE=10;
    private static final int DEFENSA=30;
    private static final String CLASE="Arquero";
    
    public Arquero(String nombre) {
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
