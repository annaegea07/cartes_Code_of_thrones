package Personatges;

public class Mag extends baseEntitat {
    private int mana;

    public Mag (String nom, int nivell, int puntsVida, int mana){
        super(nom, nivell, puntsVida);
        this.mana = mana;
    }
    @Override 
    public void atacar(){
        //flata la vida que perd
        System.out.println(getNom() + "llança un encanteri! Mana:" + mana); //getNom <- es el nom del perosnatge + comen + el superpoder

    }
}
