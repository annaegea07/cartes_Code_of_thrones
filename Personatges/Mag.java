package Personatges;

public class Mag extends baseEntitat {
    private int mana;

    public Mag (String nom, int nivell, int puntsVida, int defensa, int mana){
        super(nom, nivell, puntsVida, defensa);
        this.mana = mana;
    }
}
