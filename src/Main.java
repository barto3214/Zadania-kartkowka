import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void jedynka() {
        for (int i = 0; i < 1002; i += 2) {
            System.out.println(i + " ");
        }
    }

    public static String dwojka(String word) {

        return new StringBuilder(word).reverse().toString();
    }

    public static boolean trojka1(int number) {
        String numb = Integer.toString(number);
        String revnumb = new StringBuilder(numb).reverse().toString();
        return numb.equals(revnumb);
    }

    public static int trojka2(int number) {
        int higher = number + 1;
        int lower = number - 1;
        while (true) {
            if (trojka1(higher)) {
                return higher;
            }
            if (trojka1(lower)) {
                return lower;
            }

            lower--;
            higher++;
        }
    }

    public static Boolean piatka(String anagram, String anagram2) {
        char[] znaki1 = anagram.toCharArray();
        char[] znaki2 = anagram2.toCharArray();
        Arrays.sort(znaki1);
        Arrays.sort(znaki2);
        if (znaki1 == znaki2) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String out;
        do {
            System.out.println("Wpisz jaką chcesz funkcjonalność (1-8)\n");
            int decision = klawiatura.nextInt();
            klawiatura.nextLine();

            switch (decision) {
                case 1:
                    jedynka();
                    break;

                case 2:
                    System.out.println("Proszę wpisać słowo do sprawdzenia czy jest palindromem");

                    String word = klawiatura.nextLine();

                    String reversed = dwojka(word);

                    if (word.equals(reversed)) {
                        System.out.println("To słowo jest palindromem");
                    } else {
                        System.out.println("To słowo nie jest palindromem");
                    }
                    break;

                case 3:
                    System.out.println("Wprowadź liczbe do szukania w jej poliżu liczby palindromicznej");
                    int number = klawiatura.nextInt();
                    int closestpalindrom = trojka2(number);
                    System.out.println("Najbliższy palindrom to " + closestpalindrom);
                    klawiatura.nextLine();
                    break;

                case 4:
                    System.out.println("zrób coś3");
                    break;

                case 5:
                    System.out.println("Wpisz pierwsze słowo");
                    String anagram = klawiatura.nextLine();
                    System.out.println("Wpisz drugie słowo");
                    String anagram2 = klawiatura.nextLine();
                    if ((piatka(anagram, anagram2) == Boolean.FALSE)) {
                        System.out.println("Te słowa sa anagramami");
                    }
                    if ((piatka(anagram, anagram2) == Boolean.TRUE)) {
                        System.out.println("Te słowa nie sa anagramami");
                    }
                    break;

                case 6:
                    System.out.println("zrób coś4");
                    break;

                case 7:
                    System.out.println("zrób coś5");
                    break;

                case 8:
                    System.out.println("zrób coś");
                    break;

                default:
                    System.out.println("Widocznie jesteś idiotą bo nie umiesz wpisać");
                    break;
            }

            System.out.println("Chcesz zakończyć działanie?(Tak/Nie)");
            out = klawiatura.nextLine();
        } while (out.equals("Nie"));
    }

}