public class E06Interfete{
    public static void main (String [] args){
        m(new Cola());
        m(new Sandwich());
    }
    
    public static void m(Eatable e){
        e.eatMe();
    }
}