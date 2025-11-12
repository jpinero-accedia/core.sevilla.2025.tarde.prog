

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Tarde Juanma
 */
public class TemperaturasIterableApp {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        // Inicializando el array
        int[] temps = new int[7];
        int media = 0;
        

        // Damos valores a las posiciones
        temps[0] = 30;
        temps[1] = 27;
        temps[2] = 44;
        temps[3] = 19;
        temps[4] = 13;
        temps[5] = 33;
        temps[6] = 44;
        
     
        // Imprimimos por pantalla los valores
        int i=0;
       for(int elemento : temps) {
           System.out.println(elemento);
           media = media + elemento;
           i++;
       }
       
       media = media / temps.length;
       
        System.out.println("La media es " + media);
    }
}
