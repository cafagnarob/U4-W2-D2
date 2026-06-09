package es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StampaArrayDiStringhe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- inserisci il numero di parole da inserire----");
        int N = Integer.parseInt(scanner.nextLine());

        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleUguali = new HashSet<>();

        System.out.println("--------- insiresci" + " " + N + " " + "parole--------");
        for (int i = 0; i < N; i++) {
            String parola = scanner.nextLine();
            if (!paroleDistinte.add(parola)) {
                paroleUguali.add(parola);
            }


        }

        System.out.println("-------- Parole Duplicate-----------");
        if (paroleUguali.isEmpty()) {
            System.out.println("------ nessun duplicato-------");
        } else {
            for (String parola : paroleUguali) {
                System.out.println(parola);
            }
        }


        System.out.println(" le parole diverse sono:" + paroleDistinte.size());

        System.out.println("------- elenco di parole distinte-------");
        for (String parola : paroleDistinte) {
            System.out.println(parola);
        }

        scanner.close();
    }
}
