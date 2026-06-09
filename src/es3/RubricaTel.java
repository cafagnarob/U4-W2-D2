package es3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTel {
    private Map<String, String> contatti;

    public RubricaTel() {
        this.contatti = new HashMap<>();
    }

    public void InseriscoContatto(String nome, String telNum) {
        if (contatti.containsKey(nome)) {
            System.out.println("----- contatto gia esistente-----");
        } else {
            contatti.put(nome, telNum);
            System.out.println("----- contatto inserito-----");
            System.out.println(nome + " " + telNum);
        }
    }


    public void cancelloContatto(String nome) {
        if (contatti.containsKey(nome)) {
            contatti.remove(nome);
            System.out.println("------ contatto eliminato-----");
            System.out.println(contatti);
        } else {

            System.out.println("------ contatto non esiste-----");
        }
    }

    public String cercaNumeri(String tel) {
        for (Map.Entry<String, String> contatto : contatti.entrySet()) {

            if (contatto.getValue().equals(tel)) {
                return contatto.getKey();
            }

        }
        return null;
    }

    public String cercaNome(String nome) {
        return contatti.get(nome);
    }

    public void stampaTuttiContatti() {
        if (contatti.isEmpty()) {
            System.out.println("------- contatti vuoto------");
        } else {
            for (Map.Entry<String, String> contatto : contatti.entrySet()) {
                System.out.println("nome=" + contatto.getKey() + "- telefono=" + contatto.getValue());
            }
        }
    }


}
