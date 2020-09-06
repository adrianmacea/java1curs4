public class Masina{
    int r; // am declarat un atribut al masinii - roata
    
    class Motor{ //masina are un motor
        public void ruleaza(){ // motorul are un comportament
            r++; // atunci cand motorul ruleaza roata se invarte
        } 
        // morala: desi roata este un atribut al masinii, motorul este cel care o invarte
        // astfel o instanta, prin comportamentele ei poate afecta o alta instanta = dependenta dintre doua instante
    }
    
}