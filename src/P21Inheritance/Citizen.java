package P21Inheritance;

public class Citizen {
    private String name;
    private long aadharName;
    private String Address;

    public Citizen() {

    }

    public Citizen(String name, long aadharName, String address) {
        this.name = name;
        this.aadharName = aadharName;
        Address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAadharName() {
        return aadharName;
    }

    public void setAadharName(long aadharName) {
        this.aadharName = aadharName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
