public class CheckPasswod {
    private static final String PASSWORD = "password";
    public static void check(String word){
        if (word.equals(PASSWORD) == true){
            System.out.println("Ви вгадали");
        } else {
            System.out.println("Ви не вгадали");
        }
    }
}
