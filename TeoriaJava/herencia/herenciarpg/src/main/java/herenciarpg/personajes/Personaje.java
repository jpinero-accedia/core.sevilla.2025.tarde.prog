package herenciarpg.personajes;

import herenciarpg.RPGException;


public abstract class Personaje {
    private String nombre;
    private int vida;
    
    public Personaje(String n) {
       nombre = n;
       vida = 100;
    }
    
    public boolean estaMuerto () {
        return vida <= 0;
    }
    
    public void ataca (Personaje o) throws RPGException {
        if (estaMuerto()) {
            throw new RPGException(String.format("%s está muerto, no puede atacar.\n",this));
        }
        
        if (o.estaMuerto()) {
            throw new RPGException(String.format("%s está muerto, no se le puede atacar.\n",o));
        }
        
        System.out.printf("%s ataca a %s.\n",this,o);
        
        int danio = getAtaque() - o.getDefensa();
        
        if (danio > 0) {
            o.vida -= danio;
            o.vida = Math.max(0, o.vida);
        
            if (o.estaMuerto()) {
                System.out.printf("%s ha muerto.\n", o);
            }
        }
        else {
            System.out.printf("%s no hace daño a %s.\n", this, o);
        }
    }
    
    public void mostrarEstado() {
        System.out.printf(
            "%s - Vida: %03d | Ataque: %03d | Defensa: %03d\n",
            this,
            vida,
            getAtaque(),
            getDefensa()
        );
    }
    
    public void metodoProblematico () throws Exception {
        throw new Exception("PROBLEMATICO");
    }
    
    @Override
    public String toString() {
        return String.format("[%s] %s", getClase(), nombre);
    }
    
    protected abstract String getClase();
    protected abstract int getAtaque();
    protected abstract int getDefensa();
}
