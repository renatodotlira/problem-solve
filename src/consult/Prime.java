package consult;

public class Prime {

    public static void main(String[] args) {

        System.out.println(isPrime(7));

    }

    static boolean isPrime(int n) {
        for (int x = 2; x * x <= n; x++) {
            if (n % x == 0)
                return false;
        }
        return true;
    }

}
