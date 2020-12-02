import java.util.Date;

public class Staff extends Person{
    private String type;

    private Staff(String name, String dateOfBirth, String address, String phoneNumber, String type) {
        super(name, dateOfBirth, address, phoneNumber);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
