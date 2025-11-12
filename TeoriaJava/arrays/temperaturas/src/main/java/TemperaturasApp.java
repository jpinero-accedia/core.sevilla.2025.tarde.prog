
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Tarde Juanma
 */
public class TemperaturasApp {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        // Inicializando el array
        int[] temps = new int[7];
        int i = 0;
        int menor = 0;
        int mayor = 0;
        double media = 0;

        // Damos valores a las posiciones
        temps[0] = 30;
        temps[1] = 27;
        temps[2] = 44;
        temps[3] = 19;
        temps[4] = 13;
        temps[5] = 33;
        temps[6] = 44;
        
     
        // Imprimimos por pantalla los valores
        for (i = 0; i < temps.length; i++) {
            System.out.printf("%d : %d\n", i, temps[i]);
            
            media = media + temps[i];

            if (i==0) {
                menor = temps[i];
                mayor = temps[i];
            } else {
                if (temps[i] < menor) {
                    menor = temps[i];
                }
                
                if (temps[i] > mayor) {
                    mayor = temps[i];
                }
            }
        }
        
        media = media / temps.length;


        
        // Estadisticas
        System.out.println("La temperatura más baja es: " + menor);
        System.out.println("La temperatura más alta es: " + mayor);
        System.out.println("La temperatura media es: " + media);
    }
}
