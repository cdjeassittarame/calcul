package main.com.company;


import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        int nombreCalcul=0;
        String nombre1=null;
        String nombre2=null;
        String Calcul=null;
        int integerCalcul=0;
        String Recommencer=null;

        System.out.println("Bienvenue dans votre calculatrice");
        do {

            System.out.println("Veuillez Choisir un type de calcul");
            do {
                Scanner scannerCalcul = new Scanner(System.in);
                System.out.println("1.Addition 2.Soustraction 3.Multiplication 4.Division 5.Reset");
                Calcul = scannerCalcul.nextLine();
                integerCalcul = Integer.parseInt(Calcul);
            }while(integerCalcul < 1 | integerCalcul > 5);

            if (integerCalcul == 5){
                nombreCalcul = 0;
            }

            if (nombreCalcul == 0) {
                Scanner scannerNombre1 = new Scanner(System.in);
                System.out.println("Veuillez Choisir un premier nombre");
                nombre1 = scannerNombre1.nextLine();
            }


            Scanner scannerNombre2 = new Scanner(System.in);
            if(nombreCalcul != 0){
                System.out.println("Veuillez Choisir un deuxieme nombre à calculer avec " + nombreCalcul);
            }else {
                System.out.println("Veuillez Choisir un deuxieme nombre");
            }
            nombre2 = scannerNombre2.nextLine();

            try {
                nombreCalcul = Integer.parseInt(nombre1);
                int integerNombre2 = Integer.parseInt(nombre2);


                if (integerCalcul >= 1 & integerCalcul <= 4) {
                    switch (integerCalcul) {
                        case 1:
                            System.out.println(nombreCalcul + " + " + integerNombre2);
                            nombreCalcul = nombreCalcul + integerNombre2;
                            nombre1 = String.valueOf(nombreCalcul);
                            System.out.println("Resultat: " + nombreCalcul);
                            break;
                        case 2:
                            System.out.println(nombreCalcul + " - " + integerNombre2);
                            nombreCalcul = nombreCalcul - integerNombre2;

                            if(nombreCalcul < 0){
                                System.out.println("Resultat: " + Math.abs(nombreCalcul) * (-1));
                                nombre1 = String.valueOf(nombreCalcul);
                            }else {
                                nombre1 = String.valueOf(nombreCalcul);
                                System.out.println("Resultat: " + nombreCalcul);
                            }
                            break;
                        case 3:
                            System.out.println(nombreCalcul + " * " + integerNombre2);
                            nombreCalcul = nombreCalcul * integerNombre2;
                            nombre1 = String.valueOf(nombreCalcul);
                            System.out.println("Resultat: " + nombreCalcul);
                            break;
                        case 4:
                            System.out.println(nombreCalcul + " / " + integerNombre2);
                            nombreCalcul = nombreCalcul / integerNombre2;
                            nombre1 = String.valueOf(nombreCalcul);
                            System.out.println("Resultat: " + nombreCalcul);
                            break;
                        default:
                            System.out.println("null");
                    }
                }


                    Scanner scannerRecommencer = new Scanner(System.in);
                    System.out.println("Voulez-vous recommencer Y ou N");
                    Recommencer = scannerRecommencer.nextLine();


            } catch (NumberFormatException e) {
                System.out.println("Error: " + e);
                return;
            }
        }while(Recommencer.equals("Y"));

    }

}
