package challenger;

import java.math.BigInteger;

public class FibonacciNumbersSum {

    public static void main(String[] args) {
        System.out.println(Fibonacci.sumFibonacciNumbers(4000000));
    }

    private static class Fibonacci{

        private static BigInteger sumFibonacciNumbers(int n){
            BigInteger total = BigInteger.valueOf(2);
            int i = 1;
            int x = 2;
            int aux;
            while (x <= n){
                aux = x;
                x = x + i;
                i = aux;
                if(x < n && x % 2 == 0)
                    total = total.add(BigInteger.valueOf(x));
            }
            return total;
        }

    }

}
