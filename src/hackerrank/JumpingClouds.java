package hackerrank;

public class JumpingClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int tamanho = c.length;

        int count = 0;

        for (int x = 0; x < tamanho;) {
            if (x + 2 < tamanho && c[x + 2] == 0 ) {
                count++;
                x = x + 2;
            }else if(x + 1 < tamanho){
                count++;
                x++;
            }else {
                x++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] c = {0, 0, 1, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(c));
    }

}
