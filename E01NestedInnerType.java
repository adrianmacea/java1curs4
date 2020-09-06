public class E01NestedInnerType{
    public static void main (String [] args){
        // instantiez o clasa Inner Statica prin dereferentiere din clasa Outer (atat pt tip cat si pt constructor)
        A1.A3 a3 = new A1.A3(); 
        // apoi pot sa apelez metoda care a fost creata in interiorul clasei Inner Statica
        a3.m2();
        
        // pentru o clasa Inner Non-Statica tipul de data care pastreaza referinta se dereferentiaza la fel, din clasa Outer
        A1.A2 a2;
        // crearea instantei Inner (constructorul ei) nu se poate face prin dereferentiere directa, 
        // pt ca trebuie sa depina de o instanta a clasei Outer
        // de aceea cream mai intai o instanta a clasei Outer pe baza careia sa putem instantia apoi pe Inner        
        A1 a1 = new A1();
        a2 = a1.new A2();
        
        System.out.println(a1.a); // 0.0 - valoarea implicita
        a2.m1();
        System.out.println(a1.a); // 10 - valoarea setata de metoda m1
    }
}