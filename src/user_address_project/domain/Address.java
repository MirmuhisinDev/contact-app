package user_address_project.domain;

public class Address {
    private Long id;
    private String region;
    private String district;
    private String street;
    private int homeNumber;
    public Address(Long id, String region, String district, String street, int homeNumber){
        this.id = id;
        this.region = region;
        this.district = district;
        this.street = street;
        this.homeNumber = homeNumber;
    }
    public Address(){

    }

    public void setId(Long id){
            this.id = id;
    }
    public Long getId(){
      return this.id;
    }
    public void setRegion(String region){
        this.region = region;
    }
    public String getRegion(){
        return this.region;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    public String getDistrict() {
        return this.district;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public String getStreet(){
        return this.street;
    }
    public void setHomeNumber(int homeNumber){
        this.homeNumber = homeNumber;
    }

    public int getHomeNumber() {
        return this.homeNumber;
    }

    public String toString(){
        return "Adress {\nid: " + this.id + "\nregion: "+this.region + "\ndistrict: "+this.district +
                "\nstreet : "+this.street + "\nhomeNumber: "+this.homeNumber + "\n}";
    }
}
