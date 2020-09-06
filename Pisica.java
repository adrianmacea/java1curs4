public class Pisica{
    String nume;
    int varsta;
    
    public Pisica(String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;
    }
    
    public String toString(){
        return nume+" "+varsta; 
        //apelarea acestui coportament va reprezenta instanta Pisicii printr-un sir de caractere
        //facem asta prin suprascrierea metodei toString din clasa Object a pachetului Java Lang
    }
    
    //suprascriem metoda equals din clasa Object, pachetul Java Lang
    //pentru a putea stabili ce inseamna egalitate intre doua instante, in cazul nostru sa aiba aceeasi varsta
    public boolean equals(Object o){
        if(o instanceof Pisica){
            Pisica p = (Pisica) o;
            return p.varsta == this.varsta;
        }else{
           return false;
        }
    }
}