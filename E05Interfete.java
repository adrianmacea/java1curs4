public class E05Interfete{
    public static void main(String [] args){
        Personaj p = new Dracula();
        
        Dracula d = (Dracula) p;
        
        Monstruos m = new Dracula();
        m.teSperie();
        
        Sangeros s = new Dracula();
        s.beaSange();
        
        Vampir v = new Dracula();
        v.teSperie();
        v.beaSange();
    }
}