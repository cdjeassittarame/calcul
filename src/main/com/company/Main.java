package main.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nombreCalcul=0;
        String nombre1=null;
        String nombre2=null;
        String Calcul=null;
        System.out.println("Bienvenue dans votre calculatrice");
        do {
            System.out.println("Veuillez Choisir un type de calcul");
            Scanner scannerCalcul = new Scanner(System.in);
            System.out.println("1.Addition 2.Soustraction 3.Multiplication 4.Division 5.Reset");
            Calcul = scannerCalcul.nextLine();
            int integerCalcul = Integer.parseInt(Calcul);

            if (integerCalcul == 5){
                nombreCalcul = 0;
            }

            if (nombreCalcul == 0) {
                Scanner scannerNombre1 = new Scanner(System.in);
                System.out.println("Veuillez Choisir un premier nombre");
                nombre1 = scannerNombre1.nextLine();
            }


            Scanner scannerNombre2 = new Scanner(System.in);
            System.out.println("Veuillez Choisir un deuxieme nombre");
            nombre2 = scannerNombre2.nextLine();

            try {
                nombreCalcul = Integer.parseInt(nombre1);
                int integerNombre2 = Integer.parseInt(nombre2);


                if (integerCalcul >= 1 & integerCalcul <= 4) {
                    switch (integerCalcul) {
                        case 1:
                            nombreCalcul = nombreCalcul + integerNombre2;
                            nombre1 = String.valueOf(nombreCalcul);
                            System.out.println(nombreCalcul);
                            break;
                        case 2:
                            nombreCalcul = nombreCalcul - integerNombre2;
                            nombre1 = String.valueOf(nombreCalcul);
                            System.out.println(nombreCalcul);
                            break;
                        case 3:
                            nombreCalcul = nombreCalcul * integerNombre2;
                            nombre1 = String.valueOf(nombreCalcul);
                            System.out.println(nombreCalcul);
                            break;
                        case 4:
                            nombreCalcul = nombreCalcul / integerNombre2;
                            nombre1 = String.valueOf(nombreCalcul);
                            System.out.println(nombreCalcul);
                            break;
                        default:
                            System.out.println("null");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e);
                return;
            }
        }while(true);

    }
}
