package P19AcessSpecifier;

public class AcessSpecifier {

    int varDefault =0;
    public int varPublic = 10;
    private int varPrivate =11;
    protected int varProtected = 15;

    void defaultMethod(){
        System.out.print("Default: ");
        System.out.println(varDefault);
    }

    public void publicMethod(){
        System.out.print("Public: ");
        System.out.println(varPublic);
    }

    private void privateMethod(){
        System.out.print("Private: ");
        System.out.println(varPrivate);
    }

    protected void protectedMethod(){
        System.out.print("Protected: ");
        System.out.println(varProtected);
    }
}
