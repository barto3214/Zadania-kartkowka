import java.util.Scanner;

public class Main {
    public static void jedynka(){
        for(int i = 0;i<1002;i+=2){
            System.out.println(i + " ");
        }
    }

    public static String dwojka(String word){

        return new StringBuilder(word).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String out;
        do{
        System.out.println("Wpisz jaką chcesz funkcjonalność (1-8)\n");
        int decision = klawiatura.nextInt();
            klawiatura.nextLine();

        switch (decision){
            case 1:
                    jedynka();
                break;

            case 2:
                System.out.println("Proszę wpisać słowo do sprawdzenia czy jest palindromem");

                String word = klawiatura.nextLine();

                String reversed = dwojka(word);

                if(word.equals(reversed)){
                    System.out.println("To słowo jest palindromem");
                }
                else{
                    System.out.println("To słowo nie jest palindromem");
                }
                break;

            case 3:
                System.out.println("zrób coś1");
                break;

            case 4:
                System.out.println("zrób coś2");
                break;

            case 5:
                System.out.println("zrób coś3");
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
    }while(out.equals("Nie"));
    }

}