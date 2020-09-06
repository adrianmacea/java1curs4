public class E02Dependency{
    public static void main (String [] args){
        Masina m = new Masina();
        Masina.Motor mot = m.new Motor();
        
        System.out.println(m.r);
        mot.ruleaza();
        System.out.println(m.r);
        mot.ruleaza();
        System.out.println(m.r);
        mot.ruleaza();
        System.out.println(m.r);
        mot.ruleaza();
        System.out.println(m.r);
        mot.ruleaza();
        System.out.println(m.r);
        mot.ruleaza();
        System.out.println(m.r);
    }
}