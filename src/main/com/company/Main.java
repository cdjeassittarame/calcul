package main.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
int nombreCalcul=0;
        System.out.println("Bienvenue dans votre calculatrice");

        Scanner scannerNombre1 = new Scanner(System.in);
        System.out.println("Veuillez Choisir un premier nombre");
        String nombre1 = scannerNombre1.nextLine();

        Scanner scannerNombre2 = new Scanner(System.in);
        System.out.println("Veuillez Choisir un deuxieme nombre");
        String nombre2 = scannerNombre2.nextLine();

        System.out.println("Veuillez Choisir un type de calcul");
        Scanner scannerCalcul = new Scanner(System.in);
        System.out.println("1.Addition 2.Soustraction 3.Multiplication 4.Division");
        try {
            String Calcul = scannerCalcul.nextLine();
            int integerCalcul = Integer.parseInt(Calcul);
            int integerNombre1= Integer.parseInt(nombre1);
            int integerNombre2= Integer.parseInt(nombre2);
            if (integerCalcul >= 1 & integerCalcul <= 4) {
                switch (integerCalcul){
                    case 1:
                        nombreCalcul = integerNombre1 + integerNombre2;
                        System.out.println(nombreCalcul);
                        break;
                    case 2:
                        nombreCalcul = integerNombre1 - integerNombre2;
                        System.out.println(nombreCalcul);
                        break;
                    case 3:
                        nombreCalcul = integerNombre1 * integerNombre2;
                        System.out.println(nombreCalcul);
                        break;
                    case 4:
                        nombreCalcul = integerNombre1 / integerNombre2;
                        System.out.println(nombreCalcul);
                        break;
                    default:
                        System.out.println("null");
                }
            }
        }catch (NumberFormatException e){
            System.out.println("Error: " + e);
            return;
        }
        System.out.println("fin du programme");
        return;

    }
}
