package Personatges;

public class Mag extends baseEntitat {
    private int mana;

    public Mag (String nom, int nivell, int puntsVida, int mana, int dany){
        super(nom, nivell, puntsVida, dany);
        this.mana = mana;
    }
    @Override 
    public void atacar(baseEntitat enemigo){
        //flata la vida que perd
        // System.out.println(getNom() + "llança un encanteri! Mana:" + mana); //getNom <- es el nom del perosnatge + comen + el superpoder
        System.out.println("Yo: " + this.getNom() + " ataco a: " + enemigo.getNom() + " magicamente. quitándole " + this.getDany());
        enemigo.setPuntsVida(enemigo.getPuntsVida() - this.getDany());
    }
}
