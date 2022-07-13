import java.util.ArrayList;

public class Numbers {
    public static void evenNumbers(int size, int array[]) {
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> notEven = new ArrayList<Integer>();

        for (int i = 0; i < size; i++)
            if (array[i] % 2 != 0)
                notEven.add(array[i]);
            else if (array[i] % 2 == 0)
                even.add(array[i]);
        System.out.println("Непарні числа: " + notEven);
        System.out.println("Парні числа: " + even);

    }

    public static void max(int size, int array[]){
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println("Максимальне число:" + max);
    }
    public static void min(int size, int array[]){
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (min > array[i])
                min = array[i];
        }
        System.out.println("Мінімальне число:" + min);
    }
    public static void divisibleNumbersThreeOrNine(int size, int array[]){
        for (int i = 0; i < size; i++){
            if ((array[i] % 3 == 0) || (array[i] % 9 == 0)){
                System.out.println("Число, яке ділиться на 3 aбо 9: " + array[i]);
            }
        }
    }
    public static void divisibleNumbersFiveAndSeven(int size, int array[]){
        for (int i = 0; i < size; i++){
            if ((array[i] % 5 == 0) && (array[i] % 7 == 0)){
                System.out.println("Число, яке ділиться на 5 та 7: " + array[i]);
            }
        }
    }
}
