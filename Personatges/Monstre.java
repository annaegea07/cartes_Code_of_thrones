package Personatges;

public class Monstre extends baseEntitat {
    private int salvatge;

    // Constructor de la subclasse
    public Monstre (String nom, int nivell, int puntsVida, int defensa, int salvatge){
        super(nom, nivell, puntsVida, defensa);
        this.salvatge = salvatge;
    }

    
}
