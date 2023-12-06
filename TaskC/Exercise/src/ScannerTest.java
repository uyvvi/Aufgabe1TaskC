import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Eingabe 1
        System.out.println("1>");
        String input1 = sc.nextLine();
        
        // Eingabe 2
        System.out.println("2>");
        String input2 = sc.nextLine();
        
        // Eingabe 3
        System.out.println("3>");
        String input3 = sc.nextLine();

        // Konvertierung in Großbuchstaben und Konkatenation mit Trennzeichen
        String result = input1.toUpperCase() + " | " + input2.toUpperCase() + " | " + input3.toUpperCase();

        // Ausgabe
        System.out.println(result);
    }
}
