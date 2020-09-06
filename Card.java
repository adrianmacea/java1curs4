/**
 * c1 are seria 12345 - suma cifrelor e 15
 * c2 are seria 12345 - suma cifrelor e 15
 * c3 are seria 54321 - suma cifrelor e 15
 * 
 * toate cardurile au suma cifrelor seriei egala cu 15 dar doar c1 == c2, deci folosirea sumei respecta regula hashCode
 */

public class Card{
    String serie;
    
    public Card(String serie){
        this.serie = serie;
    }
    
    public int hashCode(){
        int suma = 0;
        for(int i=0;i<serie.length();i++){
            char c = serie.charAt(i);
            suma += Integer.parseInt(String.valueOf(c));
        }
        
        return suma;
    }
    
    //definim ca doua carduri sunt egale daca au aceeasi serie
    public boolean equals(Object o){
        if(o instanceof Card){
            Card c = (Card) o;
            return this.serie.equals(c.serie);
        }else{
            return false;
        }
    }
}