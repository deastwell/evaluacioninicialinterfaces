package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero inicio:");
        int inicio = sc.nextInt();
        System.out.println("Introduce numero final:");
        int fin = sc.nextInt();
        int contador = 0;


        for(int i = inicio; i <= fin; i++){
            int cresto = 0;
            for(int j = i; j>=1; j--){
                int resto = i%j;
                if(resto==0){
                    cresto++;
                }
            }

            if(cresto==2){
                contador++;
                System.out.println(i+" ES PRIMO");
            }

        }

        System.out.println("TOTAL PRIMOS; "+contador);
    }
}


