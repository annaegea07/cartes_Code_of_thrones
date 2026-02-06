package Personatges;

public class Monstre extends baseEntitat {

    private int salvatge;

    public Monstre(String nom, int nivell, int puntsVida, int salvatge) {
        super(nom, nivell, puntsVida);
        this.salvatge = salvatge;
    }

    @Override
    public void atacar() {
        System.out.println(getNom() + " ataca! Salvatge: " + salvatge);
    }
}
