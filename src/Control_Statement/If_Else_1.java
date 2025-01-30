package Control_Statement;

public class If_Else_1 {
    public static void main(String[] args) {
        int Age = -11;

        if (0<Age&&Age<18){
            System.out.println("Your Are Minor");
        } else if (Age>=18) {
            System.out.println("Your Are Adult");
        }
        else {
            System.out.println("Invalid Age");
        }
    }
}
