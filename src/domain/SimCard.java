package domain;

public class SimCard {
    private Long id;
    private String companyName;
    private String number;

    public SimCard(Long id, String companyName, String number) {
        this.id = id;
        this.companyName = companyName;
        this.number = number;
    }
    public SimCard(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "SimCard{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", number='" + number + '\'' +'}';
    }
}
