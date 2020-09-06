public class E03NestedAnonymousType{
    public static void main (String [] args){
        Angajat a1 = new Angajat(1000, 8);
        Angajat a2 = new Angajat(1000, 3);
        Angajat gigel = new Angajat(1000, 1){
            public double getSalariu(){
                return 5000; //am Suprascris getSalariu doar pentru instanta gigel, fiul patronului
            }
        };
        Angajat a4 = new Angajat(1000, 4);
        
        System.out.println(a1.getSalariu());
        System.out.println(a2.getSalariu());
        System.out.println(gigel.getSalariu());
        System.out.println(a4.getSalariu());
    }
}