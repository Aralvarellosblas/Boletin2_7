package boletin2_07;

import java.util.Scanner;

public class Boletin2_07 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        float K, C, F;
        System.out.println("Introduce temperatura en ºC");
        C=teclado.nextFloat();
        K=(float) (273.15+C);
        F=32+(float)1.8*C;
        System.out.println(C+" Grados Celsius son "+K+ " grados Kelvin y "+F+" grados Farenheit");
    }
    
}
