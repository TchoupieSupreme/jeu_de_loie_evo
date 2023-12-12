package ovh.johanpassion;

import java.util.Random;
//import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /*
         * Random generateur = new Random();
         * int caseActuelle = 0;
         * int nbPartie = 1;
         * int i=0;
         * Scanner clavier = new Scanner(System.in);
         * do {
         * caseActuelle =0;
         * while (caseActuelle!=20){
         * i++;
         * int lancer = generateur.nextInt(6)+1;
         * caseActuelle += lancer;
         * if (20-caseActuelle>0) {
         * System.out.println("Lancer "+(i+1)+" : vous avez faits "
         * +lancer+". Vous êtes sur la case "+caseActuelle+" (encore "+(20-caseActuelle)
         * +")");
         * }else if(20-caseActuelle==0){
         * System.out.println("Lancer "+(i+1)+" : vous avez faits "
         * +lancer+". Vous êtes sur la case "+caseActuelle+" !");
         * }else{
         * System.out.println("Lancer "+(i+1)+" : vous avez faits "
         * +lancer+". Vous êtes sur la case "+caseActuelle+" (vous avez dépassé de "+(
         * Math.abs(20-caseActuelle))+" case donc vous retourner sur la case "+(20-(Math
         * .abs(20-caseActuelle)))+")");
         * caseActuelle = 20-(Math.abs(20-caseActuelle));
         * }
         * }
         * if (20-caseActuelle !=0) {
         * System.out.println("Vous avez perdu !");
         * nbPartie++;
         * }
         * } while (20-caseActuelle != 0);
         * if (nbPartie>1) {
         * System.out.println("Vous avez gagné en "+(nbPartie)+" parties !");
         * }else{
         * System.out.println("Vous avez gagné en "+(nbPartie)+" partie !");
         * }
         * 
         * clavier.close();
         */
        int caseObjectif = 20;
        int nbLancers = 5;
        Random generateur = new Random();
        boolean gagne = false;
        int compteurSimulations = 0;
        while (!gagne) {
            compteurSimulations++;
            int caseCourante = 0;
            for (int i = 1; i <= nbLancers; i++) {
                int lancer = generateur.nextInt(6) + 1;
                caseCourante = caseCourante + lancer;
                System.out.println(String.format("Lancer %d : vous avez fait %d. Vous êtes sur la case %d.",
                        i, lancer, caseCourante));
            }
            gagne = gagne(caseCourante, caseObjectif, compteurSimulations, gagne);
        }
    }

    public static boolean gagne(int caseCourante, int caseObjectif, int compteurSimulations, boolean gagne) {
        // Test pour savoir si on à gagner ou pas
        if (caseCourante == caseObjectif) {
            System.out.println("Vous avez gagné !");
            System.out.println("Il aura fallu " + compteurSimulations + " simulations pour gagner.");
            gagne = true;
            return gagne = true;
        } else if (caseCourante > caseObjectif) {
            System.out.println("Vous dépassez, vous avez perdu !");
            return gagne;
        } else {
            System.out.println("Il vous en manque "+ (caseObjectif-caseCourante)+" pour arriver à " + caseObjectif + " !");
            return gagne;

        }
    }

}
