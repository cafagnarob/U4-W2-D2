package es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Eserczizio2 {


    public static void main(String[] args) {
        List<Integer> primaLista = getRandomNum(3);
        List<Integer> nuovissimaLista = mirrorNum(primaLista);
        System.out.println(primaLista);
        System.out.println(nuovissimaLista);
        pariDispari(nuovissimaLista, true);
        pariDispari(nuovissimaLista, false);

    }

    public static List<Integer> getRandomNum(int N) {
        
        Random random = new Random();

        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lista.add(random.nextInt(101));


        }

        Collections.sort(lista);

        return lista;
    }

    public static List<Integer> mirrorNum(List<Integer> lista) {
        List<Integer> nuovaLista = new ArrayList<>(lista);
        List<Integer> listaInvertita = new ArrayList<>(lista);
        Collections.reverse(listaInvertita);
        nuovaLista.addAll(listaInvertita);
        return nuovaLista;
    }

    public static void pariDispari(List<Integer> lista, boolean check) {

        for (int i = 0; i < lista.size(); i++) {
            if (check) {
                if (i % 2 != 0) {
                    System.out.println("l'indice" + " " + i + " " + lista.get(i) + ", ");

                }
            } else {
                if (i % 2 == 0) {

                    System.out.println("l'indice" + " " + i + " " + lista.get(i) + ", ");
                }
            }

        }


    }


}

