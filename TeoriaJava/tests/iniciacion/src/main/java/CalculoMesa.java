/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tarde Juanma
 */
public class CalculoMesa {
    private final int M;
    private final int N;
    private final int[] MESAS;
    
    public CalculoMesa (int numMesas, int numSillas) {
        this.M = numMesas;
        this.N = numSillas;
        this.MESAS = new int[this.M];
    }
    
    public void setMesa(int pos, int ocupadas) {
        this.MESAS[pos] = ocupadas;
    }
    
    public int getNumMesas() {
        return this.M;
    }
    
    public int getNumSillas() {
        return this.N;
    }
    
    public void printMesas () {
        System.out.printf("MESAS: %d - SILLAS: %d\n", this.M, this.N);
        
        for (int i=0; i<this.M; i++) {
            System.out.printf("mesa %d: %d%s\n",
                    i,
                    this.MESAS[i],
                    this.MESAS[i] >= this.N ? " LLENA!" : ""
            );
        }
    }
    
    public int calculaMesa(int numComensales) {
        System.out.println("\n===============================");
        int res = doCalculaMesa(numComensales);
        printMesas();
        System.out.printf(
            "El grupo de %d comensales se situa en la mesa %d\n",
                numComensales,
                res
        );
        
        return res;
    }
    
    private int doCalculaMesa (int numCom) {
        int i;
        int posicion = -1;
        boolean encontrado = false;
        
        if (numCom > 0 && numCom <= this.N) {
            
            // busco una mesa vacia
            i=0;
            while (!encontrado && i<this.M) {
                if (this.MESAS[i] == 0) {
                    posicion = i;
                    encontrado = true;
                }
                i++;
            }
            
            // busco una mesa con sitio
            if (!encontrado) {
                i=0;
                while(!encontrado && i<this.M) {
                    if (this.N - this.MESAS[i] >= numCom) {
                        posicion = i;
                        encontrado = true;
                    }
                    
                    i++;
                }
            }  
        }
        
        return posicion;
    }
}
