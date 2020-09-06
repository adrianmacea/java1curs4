public class B1{
    private double a; // pot fi acceasti chiar si membrii privati din interiorul structurii Nested (Local Type) B2
    static double b;
    
    //clasa Nested (Local Type) in interiorul unei metode non-tatice
    public void m1(int k){
        int w = 10; 
        //w si k devin constante implicit pentru ca sunt folosite in interiorul unei metode, 
        //de aceea nu mai pot fi nodificati in interiorul structurii Nested, sunt "final" desi nu scrie in fata lor
        class B2{
            public void m3(){
                B1.this.a = 10; //ar fi fost corecta si "a=10;" pentru ca nu mai exista alt a si ne e confuzie, dar daca exista ...
                System.out.println(w);
                System.out.println(k);
                //desi nu mai pot fi modificati w si k pot fi folositi sau afisati in interiorul structurii Nested (Local Type)
            }
        }
    }
    
    //clasa Nested (Local Type) in interiorul unei metode statice
    public static void m2(){
        class B3{
            public void m4(){
                b = 10; // nu putem accesa membrii non-statici ai clasei Outer
            }
        }
    }
}