package Personatges;

public class Monstre extends baseEntitat {

    public Monstre(String nom, int nivell, int puntsVida, int dany) {
        super(nom, nivell, puntsVida, dany);
    }

    @Override
    public void atacar(baseEntitat enemigo) {
        System.out.println("Yo: " + this.getNom() + " ataco a: " + enemigo.getNom() + " monstruosamente. quitñándole " + this.getDany());
        enemigo.setPuntsVida(enemigo.getPuntsVida() - this.getDany());
    }
}
