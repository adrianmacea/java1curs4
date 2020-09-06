public class E08ClaseWrapper{
    public static void main (String [] args){
        int x = Integer.parseInt("123"); // transforma un sir de caractere intr-o valoare de tipul int
        
        String nr1 = "10";
        String nr2 = "20";
        
        System.out.println(nr1+nr2); //1020 - plusul functoneaza ca operator de concatenare
        
        int a = Integer.parseInt(nr1); // transformam un sir de caractere intr-o valoare de tipul int
        int b = Integer.parseInt(nr2); 
        
        System.out.println(a+b); //30
        
        double w = Double.parseDouble("10.5"); // transforma un sir de caractere intr-o valoare de tipul double
        
        Integer i1 = new Integer(10); // pana la ersiunea 6 era obligatoriu sa cream instanta asa, folosind constructorul clasei
        Integer i2 = 10; // incepand cu versiunea 6 putem direct asocia primitiva
        // asta se numeste boxing - transforma primitiva in instanta de Integer (care este tip referinta, nu mai este tip primitiv)
        
        int y = i1; // inversul, transforma tipul wrapper in primitiva
        // asta se numeste unboxing
    }
}