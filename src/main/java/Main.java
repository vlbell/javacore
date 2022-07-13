import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ім'я");
        String names = sc.nextLine();
        System.out.println(Hello.hello(names));
        System.out.println("----------------------------");
        System.out.println("Введіть слово яке хочете розвернути");
        String input = sc.nextLine();
        Reverse.reverse(input);
        System.out.println("----------------------------");
        System.out.println("Input number of characters:");
        int number = sc.nextInt();
        System.out.println("Input flag: 1 if you want to go to the next line else 0");
        int flag = sc.nextInt();
        Ex3.reverse(flag, number);
        System.out.println("\n----------------------------");
        System.out.println("Уведіть слово");
        String word = sc.nextLine();
        CheckPasswod.check(word);
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("Введіть кількість чисел");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Введіть цілі числа через відступ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        Numbers.evenNumbers(size, array);
        Numbers.max(size, array);
        Numbers.min(size, array);
        Numbers.divisibleNumbersThreeOrNine(size, array);
        Numbers.divisibleNumbersFiveAndSeven(size, array);
        System.out.println("----------------------------");
        System.out.print("Введите количество членов - ");
        int n = sc.nextInt();
        System.out.print("Введите разницу - ");
        int q = sc.nextInt();
        System.out.print("Введите первый элемент - ");
        int a = sc.nextInt();
        GeometricProgression.writeProgression(n, q, a);
        System.out.println("----------------------------");

    }
}
