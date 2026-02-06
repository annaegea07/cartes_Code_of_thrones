package Personatges;

public abstract class baseEntitat {
    private String nom;
    private int nivell;
    private int puntsVida;

    //constructor
    public baseEntitat(String nom, int nivell, int puntsVida) {
        this.nom = nom;
        this.nivell = nivell;
        this.puntsVida = puntsVida;
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
        if (v < 0) v = 0; //Si algú intenta posar la vida a un valor negatiu, el setter ho corregeix automàticament i ho converteix en 0
        this.puntsVida = v;
    }
    
    public abstract void atacar();

    public void rebreDany(int quantitat) {
        int danyFinal = Math.max(0, quantitat); 
        setPuntsVida(getPuntsVida()- danyFinal);
    }
}









