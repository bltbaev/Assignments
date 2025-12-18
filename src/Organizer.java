public class Organizer {
    private String organizername;
    private String company;

    public Organizer(String organizername,String company){
        this.organizername=organizername;
        this.company=company;
    }
    public String getOrganizername() {
        return organizername;
    }
    public String getCompany() {
        return company;
    }
    public void setOrganizername(String organizername) {
        this.organizername = organizername;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void result(){
        System.out.println("Organizers name: "+organizername+", Organizer company: "+company);
    }
}
