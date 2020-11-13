import java.util.Scanner;

public class Wprowadzanie_danych {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String name = input.nextLine();
        System.out.println("Cześć " + name + "!");

        System.out.println("Ile masz lat?");
        int age = input.nextInt();
        System.out.println(age + " to dobry wiek ;)");

        System.out.println("Podaj ulubioną liczbę typu double.");
        double liczba = input.nextDouble();
        System.out.println(liczba + " to Twoja ulubiona liczba.");

    }
}
