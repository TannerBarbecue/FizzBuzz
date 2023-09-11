public class Multiples {
    public static void main(String[] args) {
        int i = 1000;
        getMultiples(i);
    }

    private static void getMultiples(int i) {
        int n = 0;
        while (n < i) {
            if (n % 3 == 0 || n % 5 == 0) {
                System.out.println(n);
            }
            n++;
        }
    }
}
