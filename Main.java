import Personatges.Guerrer;
import Personatges.Monstre;
import Personatges.baseEntitat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear la llista d'entitats 
        ArrayList<baseEntitat> llista = new ArrayList<>();

        // Crear personatges  
        Guerrer j1 = new Guerrer("Alex", 1, 100, 5); 
        Monstre j2 = new Monstre("Troll", 1, 120, 8);
        
        // Afegir-los a la llista 
        llista.add(j1); 
        llista.add(j2);

        int opcio;

        do{
            System.out.println("\n=== MENÚ DE BATALLA ==="); 
            System.out.println("1. Mostrar personatges");
            System.out.println("2. Jugar una ronda");
            System.out.println("3. Sortir");
            System.out.print("Escull una opció: ");

            opcio = sc.nextInt();

            switch (opcio) {
                case 1:
                    System.out.println("\n--- Personatges ---"); 
                    for (baseEntitat e : llista) { 
                        System.out.println(e.getNom() + " | Vida: " + e.getPuntsVida() + " | Nivell: " + e.getNivell()); 
                    }
                    break;
                case 2:
                    for (baseEntitat e : llista) { // for-each, i el que fa és recórrer tota la llista, agafant un personatge cada vegada
                        e.atacar();
                    }
                    break;
                case 3: 
                    System.out.println("Sortint del joc..."); 
                    break;
                default:
                    System.out.println("Introdueix una opció valida");
                    break;
            }

        }
    }
}
