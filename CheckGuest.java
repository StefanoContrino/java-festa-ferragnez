import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        String[] guestList = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome:");

        String nameOfUser = input.nextLine();

        boolean isFound = false;

        // Ciclo for

        // for (int i = 0; i < guestList.length; i++) {
        // // System.out.println(guestList[i]);
        // if (guestList[i].toLowerCase().equals(nameOfUser)) {
        // System.out.println("Sei invitato");
        // isFound = true;
        // break;
        // }

        // }

        // Ciclo While

        int i = 0;

        while (i < guestList.length && isFound == false) {

            if (guestList[i].toLowerCase().equals(nameOfUser)) {
                System.out.println("Sei invitato");
                isFound = true;
            }

            i++;
        }

        if (!isFound) {
            System.out.println("Non sei invitato");
        }

        input.close();
    }
}
