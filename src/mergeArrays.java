import java.security.MessageDigest;


public class mergeArrays {

    public static void main(String[] args) throws Exception {
        int[] a = new int[] {21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
        int[] b = new int[] {10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};
        int[] myA = new int[a.length + b.length];
        int ai = 0, bi = 0;
        for (int i = 0; i < myA.length; i++){
            if((ai < a.length) && (a[ai] < b[bi])) {
                myA[i] = a[ai];
                ai++;
            }
            else if (bi <= b.length){
                myA[i] = b[bi];
                bi++;
            }
            else
                System.out.println("Error");
            System.out.println(myA[i]);
        }
        System.out.println("The End");


    }
}