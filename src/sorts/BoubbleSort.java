package sorts;

import java.util.Arrays;

public class BoubbleSort {
    public static void main(String... args){
        int[] vet = {5,4,8,6,2,1,4,10,9,7,0,3};
        for(int x = 0; x< 11; x++){
            System.out.println(Arrays.toString(vet));
            System.out.println("x:"+vet[x]);
            for(int y = x; y<12; y++){
                System.out.println("y:"+vet[y]);
                if(vet[x]>vet[y]){
                    int aux = vet[y];
                    vet[y] = vet[x];
                    vet[x] = aux;
                    System.out.println(Arrays.toString(vet));
                }
            }
            System.out.println("-----------------------");
        }
    }
}
