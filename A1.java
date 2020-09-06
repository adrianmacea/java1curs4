/**
 * 1) Clase Top Level scrise direct in fisierul de cod sursa (ex: A1)
 * 2) Clase Nested 
 * - inner (structuri scrise ca membri ai unei clase)
 * - locale (declarate in blocuri de instructiuni,rar utilizate)
 * - anonime (des utilizate, tot un fel de locale)
 */
public class A1{
    // declar doua atribute: unul static unul non-static
    double a;
    static double b;
    
    // declar o clasa Inner non-statica si accesez ambele atribute din Outer
    class A2{
        public void m1(){
            a = 10;
            b = 10;
        }
    }
    
    // declar o classa Inner statica si pot accesa doar atributul static din Outer
    static class A3{
        public void m2(){
            b = 20;
        }
    }
}