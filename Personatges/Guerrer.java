package Personatges;

public class Guerrer extends baseEntitat {

    private int resistencia;

    public Guerrer(String nom, int nivell, int puntsVida, int resistencia, int dany) {
        super(nom, nivell, puntsVida, dany);
        this.resistencia = resistencia;
    }
    
    @Override
    public void atacar(baseEntitat enemigo) {
        System.out.println("Yo: " + this.getNom() + " ataco a: " + enemigo.getNom() + " monstruosamente. quitñándole " + this.getDany());
        enemigo.setPuntsVida(enemigo.getPuntsVida() - this.getDany());
    }
}
