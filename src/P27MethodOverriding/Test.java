package P27MethodOverriding;
public class Test {
    public static void main(String[] args) {
        RBI_ParentClass r;
        //Dynamic
        r=new RBI_ParentClass();
        System.out.println(r.getRateOfInterest());

        r=new HDFC_ChildClass();
        System.out.println(r.getRateOfInterest());

        r=new SBI_ChildClass();
        System.out.println(r.getRateOfInterest());

        r=new ICICI_ChildClass();
        System.out.println(r.getRateOfInterest());
    }
}