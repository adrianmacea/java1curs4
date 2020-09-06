import java.util.*;

public class E14RandomDice{
    public static void main (String [] args){
        Random r = new Random();
        
        //arunc 2 zaruri de 10 ori
        for(int i=0;i<10;i++){
            int x = r.nextInt(6)+1;
            int y = r.nextInt(6)+1;
            
            System.out.print(x+" "+y);
            
            //vreau sa vad cate duble am dat
            if (x == y){
                System.out.println(" dubla");
            }else{
                System.out.println();
            }
        }
    }
}