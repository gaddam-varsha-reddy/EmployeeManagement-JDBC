public class Employee {
    private int id;
    private String name;
    private int depId;
    private int addressId;

    public Employee(int id,String name,int depId,int addressId) {
        this.id = id;
        this.name=name;
        this.depId=depId;
        this.addressId=addressId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
}
