package ovh.johanpassion;

import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Random generateur = new Random();
        int caseActuelle = 0;
        int nbPartie = 1;
        Scanner clavier = new Scanner(System.in);
        do {
            caseActuelle =0;
            for (int i =0;i<5;i++){           
                clavier.nextLine();
                int lancer = generateur.nextInt(6)+1;
                caseActuelle += lancer;
                if (20-caseActuelle>0) {
                    System.out.println("Lancer "+(i+1)+" : vous avez faits "+lancer+". Vous êtes sur la case "+caseActuelle+" (encore "+(20-caseActuelle)+")");
                }else if(20-caseActuelle==0){
                    System.out.println("Lancer "+(i+1)+" : vous avez faits "+lancer+". Vous êtes sur la case "+caseActuelle+" !");
                }else{
                    System.out.println("Lancer "+(i+1)+" : vous avez faits "+lancer+". Vous êtes sur la case "+caseActuelle+" (vous avez dépassé de "+(Math.abs(20-caseActuelle))+" case)");
                }
            }
            if (20-caseActuelle !=0) {
                System.out.println("Vous avez perdu !");
                nbPartie++;
            }
        } while (20-caseActuelle != 0);
        if (nbPartie>1) {
            System.out.println("Vous avez gagné en "+(nbPartie)+" parties !");
        }else{
            System.out.println("Vous avez gagné en "+(nbPartie)+" partie !");
        }
         
        clavier.close();
    }
    
}
