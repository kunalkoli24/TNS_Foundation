package P23StaticKeywordMethod;



public class StaticDemo {
    public static void main(String[] args) {
        StaticKeyword.display();
        StaticKeyword p=new StaticKeyword();
        System.out.println(p);

        StaticKeyword.display();
        StaticKeyword p2=new StaticKeyword();
        System.out.println(p2);
    }
}
