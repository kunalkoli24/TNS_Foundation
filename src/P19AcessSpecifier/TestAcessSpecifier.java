package P19AcessSpecifier;

public class TestAcessSpecifier {
    public static void main(String[] args) {
        AcessSpecifier kv = new AcessSpecifier();
        kv.defaultMethod();
        kv.publicMethod();
       // kv.privateMethod(); //As it is private , it can be acess within the class only.
        kv.protectedMethod();
    }

}
