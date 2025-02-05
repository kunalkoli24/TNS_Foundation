public class P5_Nested_if_else {
    public static void main(String[] args) {
        int a=120;
        int b=20;
        int c=50;
        if(a>b){
            if(a>c){
                System.out.println("A is greater ");
            }
            else{
                System.out.println("C is greater ");
            }
        }
        else{
            if(b>c){
                System.out.println("B is greater ");
            }
            else{
                System.out.println("C is greater ");
            }
        }
    }
}
