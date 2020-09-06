public class E10ObjectEquals{
    public static void main (String [] args){
        Pisica p1 = new Pisica("TOM", 3);
        Pisica p2 = new Pisica("TOM", 3);
        Pisica p3 = p1;
        //aici avem 3 zone de memorie care pastreaza referintele catre 2 pisici, exista doar doua instante de pisica        
        
        System.out.println(p1 == p2); 
        //false, in memorie reprezinta o alta adresa deci sunt considerate doua pisici diferite, nu conteaza valorile atributelor
        //compararea prin == se refera la compararea referintelor
        System.out.println(p1 == p3);
        //true, pentru ca p3 este aceeasi referinta copiata din p1, nu am creat o pisica noa ci am copiat referinta celei existente
        System.out.println(p2 == p3); //false idem cu p1 == p2 de mai sus
        
        
    }
}