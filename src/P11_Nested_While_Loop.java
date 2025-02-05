public class P11_Nested_While_Loop {
    public static void main(String[] args) {
        int beg= 10;
        int end = 20;

        for(int i=beg; i<=end; i++){
            for(int j=1; j<=10; j++){
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }
    }
}
