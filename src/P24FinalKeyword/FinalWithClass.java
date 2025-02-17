package P24FinalKeyword;

final class demo{
    void show(){
        System.out.println("Final class can not be extended ...");
    }
}
//public class FinalWithClass extends demo{
//} final class can not be extended

//final class obeject can be created
public class FinalWithClass {
    public static void main(String[] args) {
        demo d=new demo();
        d.show();
    }
}