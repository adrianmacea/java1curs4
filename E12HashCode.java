public class E12HashCode{
    public static void main(String [] args){
        Card c1 = new Card("12345");
        Card c2 = new Card("12345");
        Card c3 = new Card("54321");
        
        System.out.println(c1.equals(c2)+" "+c1.hashCode()+" "+c2.hashCode());
        System.out.println(c1.equals(c3)+" "+c1.hashCode()+" "+c3.hashCode());
        System.out.println(c2.equals(c3)+" "+c2.hashCode()+" "+c3.hashCode());
    }
}