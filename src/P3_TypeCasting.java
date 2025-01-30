public class P3_TypeCasting {
    public static void main(String[] args) {
        // widening or implicit type casting
        byte b =1;
        int r= 22;
        float f= 22.4f;
        float e = (int) 22.6;
        System.out.println(e);

        char ch = 'A';
        int ch1= ch;
        System.out.println(ch1);

        // Narrowing or explicit type casting
        double d = 12323165462.22d;
        long l = (long) d;
        System.out.println(l);
        int i = (int) l;
        System.out.println(i);
        byte B =(byte) i;
        System.out.println(B);
    }
}
