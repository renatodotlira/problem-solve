import java.util.*;
class Poli{public static void main(String[]p){Scanner s=new Scanner(System.in);p=new String[s.nextInt()];int j,i=1;String b="";
        for(String z:p){
            z=s.next();
            for (j=z.length()-1;j>=0;)b+=z.charAt(j);
            System.out.print(i+++" \""+((z.equals(b))?"YES":"NO")+"\"\n");
        }
        }
}