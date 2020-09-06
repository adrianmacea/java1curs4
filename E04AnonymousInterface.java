public class E04AnonymousInterface{
    public static void main (String [] args){
        Instrument i = new Instrument(){
            public void play(){
                System.out.println("LA LA LA!");
            }
        };
        //desi Instrument este o interfata (nu se poate instantia, la fel ca si abstractele),
        //prin intermediul tipului Anonim am suprascris comportamentele abstracte
        
        i.play();
    }
}