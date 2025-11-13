/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Tarde Juanma
 */
public class NotasAlunosApp {

    public static void main(String[] args) {
        Alumno[] als = new Alumno[4];
        int i=0;
        
        als[0] = new Alumno();
        als[0].nombre = "Luis";
        als[0].nota = 9;
        
        als[1] = new Alumno();
        als[1].nombre = "María";
        als[1].nota = 4;
        
        als[2] = new Alumno();
        als[2].nombre = "Ana";
        als[2].nota = 8;
        
        als[3] = new Alumno();
        als[3].nombre = "Ricardo";
        als[3].nota = 1;
        
        // Mostrar todos los alumnos con nota igual o mayor que 5
        
        // Version con índices
        /*
        for (i=0; i<als.length; i++) {
            if (als[i].nota >=5) {
                System.out.printf("%s : %d\n", als[i].nombre,als[i].nota);
            }
        }
        */
        
        
        // version con for-each
        for (Alumno al : als) {
            if (al.nota >= 5) {
                System.out.printf("%s : %d\n", al.nombre,al.nota);
            }
        }
    }
}
