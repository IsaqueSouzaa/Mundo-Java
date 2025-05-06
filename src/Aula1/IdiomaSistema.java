package Aula1;

import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {

        Locale idioma = Locale.getDefault();

        System.out.println("O idioma:" + idioma.getLanguage());
        System.out.println("O pais:" + idioma.getCountry());
        System.out.println("O nome do idioma:" + idioma.getDisplayLanguage());
        System.out.println("O nome do pais:" + idioma.getDisplayCountry());
    }
}
