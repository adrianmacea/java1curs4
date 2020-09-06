//interfata abstract implicit

public interface Instrument{
    int x1 = 10; //public static final - implicite
    
    public void play(); //public si abstract implicit
    
    default void m(){
        System.out.println(":)"); //metoda concreta folosind keyword modificator default
    }
}