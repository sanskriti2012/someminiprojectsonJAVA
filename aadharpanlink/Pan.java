package aadharpanlink;

public class Pan {
    private String PanNumber;
    private String AadhaarNumber;
    private String bankdetails;
    private String investment;

    public Pan(String panNumber, String aadhaarNumber, String bankdetails, String investment) {
        this.PanNumber = panNumber;
        this.AadhaarNumber = aadhaarNumber;
        this.bankdetails = bankdetails;
        this.investment = investment;
    }

    public String getPanNumber() {
        return PanNumber;
    }

    public void setPanNumber(String panNumber) {
        PanNumber = panNumber;
    }

    public String getAadhaarNumber() {
        return AadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        AadhaarNumber = aadhaarNumber;
    }

    public String getBankdetails() {
        return bankdetails;
    }

    public void setBankdetails(String bankdetails) {
        this.bankdetails = bankdetails;
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "PanNumber='" + PanNumber + '\'' +
                ", AadhaarNumber='" + AadhaarNumber + '\'' +
                ", bankdetails='" + bankdetails + '\'' +
                ", investment='" + investment + '\'' +
                '}';
    }
}
