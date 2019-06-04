package com.catolica;

public class Permutacoes {
    private static int cont = 0;
    private static char[] p;

    public static void permuta(char[] vet){
        p = new char[vet.length];
        permuta(vet,0);
    }

    private static void permuta(char[] vet, int n){
        if (n == vet.length){
            cont++;
            imprime();
        }else{
            for (int i=0; i< vet.length; i++){
                p[n] = vet[i];
                permuta(vet, n+1);

            }
        }
    }
    private static void imprime(){
        System.out.println();
        System.out.println("(" + cont + "): ");
        for (int i = 0; i < p.length; i++) System.out.println(p[i] + " ");
    }
}
