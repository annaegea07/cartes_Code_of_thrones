package Personatges;

public class Guerrer extends baseEntitat {

    private int resistencia;

    public Guerrer(String nom, int nivell, int puntsVida, int resistencia) {
        super(nom, nivell, puntsVida);
        this.resistencia = resistencia;
    }
    @Override
    public void atacar() {
        System.out.println(getNom() + " ataca amb força física! Resistència: " + resistencia);
    }
}
