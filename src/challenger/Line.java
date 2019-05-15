package challenger;

public class Line {
    public static void main(String...args){
        System.out.println(Tickets(new int[]{25, 25, 50, 50, 100}));
    }
    public static String Tickets(int[] peopleInLine)
    {
        int vinte = 0;
        int cinquenta = 0;
        for(int i : peopleInLine){
            switch(i){
                case 25:
                    vinte++;
                    break;
                case 50:
                    if(vinte>0){
                        vinte--;
                    }else{
                        return "NO";
                    }
                    cinquenta++;
                    break;
                case 100:
                    if(vinte > 2){
                        vinte = vinte -3;
                    }else if (vinte > 0 && cinquenta > 0){
                        vinte--;
                        cinquenta--;
                    }else {
                        return "NO";
                    }
                    break;
            }
        }
        return "YES";
    }
}