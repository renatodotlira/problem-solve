package problems;

import java.util.Scanner;

public class ReverseInt {

    public static void main(String...args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String s = x+"";
        int reversed;
        if(x<0)
            reversed = Integer.parseInt("-"+reverse(s.substring(1,s.length())));
        else
            reversed = Integer.parseInt(reverse(s));
        System.out.println(reversed);
    }

    private static String reverse(String s){
        String reversed = "";
        for (char c:s.toCharArray()) {
            reversed = c + reversed;
        }
        return reversed;
    }

}
