package Que04;
class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner(String ownerName, String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

class Bicycle1 {
    private Owner owner;

    public Bicycle1() {
        this.owner = new Owner("Unknown", "0000000000");
    }
    public Bicycle1(String ownerName, String phoneNo) {
        this.owner = new Owner(ownerName, phoneNo);
    }

    public String getOwnerName() {
        return owner.getOwnerName();
    }

    public String getPhoneNo() {
        return owner.getPhoneNo();
    }

    public void setOwner(String ownerName, String phoneNo) {
        this.owner.setOwnerName(ownerName);
        this.owner.setPhoneNo(phoneNo);
    }
}

public class Bicycle {
    public static void main(String[] args) {
        Bicycle1 myBike = new Bicycle1("Nick John", "0774782323");
        System.out.println("Owner Name: " + myBike.getOwnerName());
        System.out.println("Phone Number: " + myBike.getPhoneNo());

        myBike.setOwner("Britny Edward", "0765432111");
        System.out.println("Updated Owner Name: " + myBike.getOwnerName());
        System.out.println("Updated Phone Number: " + myBike.getPhoneNo());
    }
}

