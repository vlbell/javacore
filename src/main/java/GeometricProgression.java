import static java.lang.Math.pow;

public class GeometricProgression {
    public static void writeProgression(int n, int q, int a) {
        for (int i = 1; i <= n; i++) {
            System.out.print(a * (int)pow(q, i - 1) + " ");
        }
    }
}
