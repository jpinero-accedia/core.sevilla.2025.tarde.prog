/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Tarde Juanma
 */
public class CalculaMesaApp {

    public static void main(String[] args) {
        //test01();
        //test02();
        test03();
    }
    
    // comprobamos numero de comensales
    public static void test01() {
        CalculoMesa calc = new CalculoMesa(5,4);
        
        assert calc.calculaMesa(3)  == 0  : "3  comensales si puede  sentarse";
        assert calc.calculaMesa(6)  == -1 : "6  comensales no pueden sentarse";
        assert calc.calculaMesa(-1) == -1 : "-1 comensal   no puede  sentarse";
        assert calc.calculaMesa(0)  == -1 : "0  comensal   no puede  sentarse";
        assert calc.calculaMesa(1)  == 0  : "1  comensal   si puede  sentarse";
        assert calc.calculaMesa(4)  == 0  : "4  comensales si pueden sentarse";
        assert calc.calculaMesa(5)  == -1 : "5  comensales no pueden sentarse";
    }
    
    public static void test02() {
        CalculoMesa calc;
        
        calc = new CalculoMesa(2,2);
        calc.setMesa(0, 2);
        
        assert calc.calculaMesa(2) == 1 :
            "si hay una mesa entera libre => ok";
        
        calc = new CalculoMesa(2,2);
        calc.setMesa(0, 2);
        calc.setMesa(1, 1);
        
        assert calc.calculaMesa(2) == -1 :
            "si no hay una mesa entera libre con max de comensales => no ok";
    }
    
    public static void test03() {
        CalculoMesa calc;
        
        calc = new CalculoMesa(3,3);
        calc.setMesa(0, 1);
        calc.setMesa(1, 1);
        calc.setMesa(2, 1);
        
        assert calc.calculaMesa(2) == 0 : "mesa con sitio => 0";
        
        calc = new CalculoMesa(3,3);
        calc.setMesa(0, 2);
        calc.setMesa(1, 1);
        calc.setMesa(2, 1);
        
        assert calc.calculaMesa(2) == 1: "mesa con sitio => 1";
        
        calc = new CalculoMesa(3,3);
        calc.setMesa(0, 2);
        calc.setMesa(1, 2);
        calc.setMesa(2, 1);
        
        assert calc.calculaMesa(2) == 2: "mesa con sitio => 2";
        
        calc = new CalculoMesa(3,3);
        calc.setMesa(0, 2);
        calc.setMesa(1, 2);
        calc.setMesa(2, 2);
        
        assert calc.calculaMesa(2) == -1: "no hay mesa con sitio";
    }
}

