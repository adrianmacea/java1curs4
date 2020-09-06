public class E11ObjectEquals{
    public static void main(String [] args){
        Pisica p1 = new Pisica("Tom", 3);
        Pisica p2 = new Pisica("Leo", 2);
        Pisica p3 = new Pisica("Cat", 3);
        
        System.out.println(p1.equals(p2)); //false
        System.out.println(p1.equals(p3)); //true, doar aici sunt varstele la fel, conform regulii pe care noi am stabilit-o 
        System.out.println(p2.equals(p3)); //false
    }
}