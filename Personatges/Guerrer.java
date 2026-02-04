package Personatges;

public class Guerrer extends baseEntitat{
    private int resistencia;

    public Guerrer (String nom, int nivell, int puntsVida, int defensa, int resistencia){
        super(nom, nivell, puntsVida, defensa);
        this.resistencia = resistencia;
    }



}


