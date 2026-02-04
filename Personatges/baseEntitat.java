package Personatges;

public abstract class baseEntitat {
    protected String nom;
    protected int nivell;
    protected int puntsVida;
    protected int defensa;


    //constructor
    public baseEntitat(String nom, int nivell, int puntsVida, int defensa) {
        this.nom = nom;
        this.nivell = nivell;
        this.puntsVida = puntsVida;
        this.defensa = defensa;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNivell() {
        return nivell;
    }

    public void setNivell(int n) {
        this.nivell = n;
    }

    public int getPuntsVida() {
        return puntsVida;
    }

    public void setPuntsVida(int v) {
        this.puntsVida = v;
    }
    public int atacar(){
        int ataque 
    }

    public boolean rebreDany(int quantitat) {
        int danyFinal = quantitat - defensa;
        if (danyFinal < 0) {
            danyFinal = 0;
        }
        puntsVida -= danyFinal;

        if (puntsVida < 0) {
            puntsVida = 0;
        }
        return puntsVida == 0;
    }

}









