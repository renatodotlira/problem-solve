package challenger;

public class UniqueCharInString {

    public static void main(String...args){
        boolean[] char_set = new boolean[256];

        int x = 0;

        x |= (8 << 1);

        System.out.println((7 | 6));

//        System.out.println(isUniqueChars("renatoo"));

    }

    public static boolean isUniqueChars(String str) {
         int checker = 0;
         for (int i = 0; i < str.length(); ++i) {
             System.out.print("i: "+i);
             int val = str.charAt(i) - 'a';
             System.out.print(", val: "+val);
             System.out.println(", checker before:"+checker);
             if ((checker & (1 << val)) > 0) return false;
             checker |= (1 << val);
             System.out.println(", checker after:"+checker);
             System.out.println("");
         }
        return true;
    }

}
