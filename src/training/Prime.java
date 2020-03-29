package training;

public class Prime {

    public static void main(String[] args) {
        isPrimeNew(521);
    }

    static boolean isPrime(int x){
        int range = (int) Math.sqrt(x);
        for(int i = 2; i <= range; i++){
            System.out.println(i);
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

    static boolean isPrimeNew(int n) {
        for (int x = 2; x * x <= n; x++) {
            System.out.println(x);
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }

    }
