public class baseEntitat {
    private String nom;
    private int nivell;
    private int puntsVida;
    //constructor
    public baseEntitat(String nom, int nivell, int puntsVida){
        this.nom=nom;
        this.nivell=nivell;
        this.puntsVida=puntsVida;
    }
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




