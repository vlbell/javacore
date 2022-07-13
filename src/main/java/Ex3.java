public class Ex3 {
    public static void reverse(int flag, int number) {
        if (flag == 1 || flag == 0) {
            for (int i = 0; i < number; i++) {
                int a = (int) (Math.random() * 1000);
                if (flag == 1) {
                    System.out.println(a);
                } else {
                    System.out.print(a + ", ");
                }

            }
        } else {
            System.out.println("flag is wrong! input 0 or 1");
        }
    }
}
