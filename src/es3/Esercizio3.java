package es3;

public class Esercizio3 {
    public static void main(String[] args) {
        RubricaTel rubrica = new RubricaTel();

        rubrica.InseriscoContatto("Mario", "3331234567");
        rubrica.InseriscoContatto("Luca", "3459876543");
        rubrica.InseriscoContatto("Anna", "3201112233");

        System.out.println("Numero di Luca: "
                + rubrica.cercaNome("Luca"));

        System.out.println("Persona con numero 3201112233: "
                + rubrica.cercaNumeri("3201112233"));


        System.out.println("\nTutti i contatti:");
        rubrica.stampaTuttiContatti();

        rubrica.cancelloContatto("Mario");

        System.out.println("\nDopo la rimozione di Mario:");
        rubrica.stampaTuttiContatti();

    }


}
