import java.util.Date;

public class Customer extends Person{
    private boolean isVip;

    public void Type(boolean isVip){
        this.isVip = isVip;
    }

    public Customer(String name, String dateOfBirth, String address, String phoneNumber, boolean isVip) {
        super(name, dateOfBirth, address, phoneNumber);
        this.isVip = isVip;
    }

    public boolean getIsVip() {
        return isVip;
    }

    public void setIsVip(boolean isVip) {
        this.isVip = isVip;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "isVip=" + isVip +
                ", name='" + getName() + '\'' +
                '}';
    }
}
