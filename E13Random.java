import java.util.Random;

public class E13Random{
    public static void main (String [] args){
        Random r = new Random();
        
        int a = r.nextInt(); // da valori in intreg spectrul int, pozitive si negative
        int b = r.nextInt(1000); // da valori in intervalul [0,999]
        double c = r.nextDouble(); // pentru valori reale in intervalul [0,1)
        boolean d = r.nextBoolean(); //genereaza random true sau false
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}