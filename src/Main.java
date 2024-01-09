import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa:");
        String stringa = scanner.nextLine();
        boolean isPari = stringaPariDispari(stringa);
        System.out.println("La stringa '" + stringa + "' ha un numero pari di caratteri? " + isPari);

        System.out.println("Inserisci un anno:");
        int anno = scanner.nextInt();
        boolean isBisestile = annoBisestile(anno);
        System.out.println("L'anno '" + anno + "' è bisestile? " + isBisestile);

        System.out.println("Inserisci un numero intero compreso tra 1 e 3:");
        byte unoDueTre = scanner.nextByte();
        scanner.nextLine();
        String trasformaNumero = trasformaNumeroInLettere(unoDueTre);
        System.out.println("Il numero inserito " + trasformaNumero);

        System.out.println("Inserisci un numero per il countdown:");
        int numeroCountdown = scanner.nextInt();
        countDown(numeroCountdown);

        while (true) {
            System.out.println("Inserisci una stringa (o ':q' per uscire):");
            String input = scanner.nextLine();

            if (input.equals(":q")) {
                System.out.println("Programma terminato.");
                break;
            }

            String risultato = suddividiStringa(input);
            System.out.println("Risultato della suddivisione: " + risultato);
        }

        scanner.close();
    }

    // Esercizio 1
    public static boolean stringaPariDispari(String str) {
        int length = str.length();
        return length % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Esercizio 2
    public static String trasformaNumeroInLettere(byte numeroUnoDueTre) {
        return switch (numeroUnoDueTre) {
            case 1 -> "è: uno";
            case 2 -> "è: due";
            case 3 -> "è: tre";
            default -> "non è compreso fra 1 e 3.";
        };
    }

    // Esercizio 3
    public static String suddividiStringa(String input) {
        StringBuilder risultato = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char carattere = input.charAt(i);
            risultato.append(carattere);

            if (i < input.length() - 1) {
                risultato.append(",");
            }
        }

        return risultato.toString();
    }

    // Esercizio 4
    public static void countDown(int numeroIniziale) {
        for (int i = numeroIniziale; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
