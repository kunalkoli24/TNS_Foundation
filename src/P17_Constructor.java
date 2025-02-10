public class P17_Constructor {
    private String custName;
    private int custId;
    private String custCity;

    public P17_Constructor() {
        System.out.println("Default Constructor ...");
    }

    public P17_Constructor(String custName, int custId, String custCity) {
        this.custName = custName;
        this.custId = custId;
        this.custCity = custCity;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    @Override
    public String toString() {
        return "P17Constructor{" +
                "custName='" + custName + '\'' +
                ", custId=" + custId +
                ", custCity='" + custCity + '\'' +
                '}';
    }

    public static void main(String[] args) {
        P17_Constructor P=new P17_Constructor();
        P.setCustCity("Mumbai");
        P.setCustId(2);
        P.setCustName("Kunal");
        System.out.println(P);
        P17_Constructor P2=new P17_Constructor("Vaishnavi",1,"Pune");
        System.out.println(P2.toString());
    }
}