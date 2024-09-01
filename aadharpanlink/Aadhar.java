package aadharpanlink;

public class Aadhar {
    private String AadhaarNumber;
    private String Name;
    private String FatherName;
    private String Address;

    public Aadhar(String aadhaarNumber, String name, String fatherName, String address) {
        this.AadhaarNumber = aadhaarNumber;
        this.Name = name;
        this.FatherName = fatherName;
        this.Address = address;
    }

    public String getAadhaarNumber() {
        return AadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        AadhaarNumber = aadhaarNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    @Override
    public String toString() {
        return "Aadhar{" +
                "AadhaarNumber='" + AadhaarNumber + '\'' +
                ", Name='" + Name + '\'' +
                ", FatherName='" + FatherName + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
