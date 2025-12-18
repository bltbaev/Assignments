public class Event {
    private String eventname;
    private String date;
    private String location;
    private String dressСode;

    public Event(String eventname,String date,String location,String dressСode){
        this.eventname = eventname;
        this.date=date;
        this.location=location;
        this.dressСode=dressСode;
    }
    public String getEventname() {
        return eventname;
    }
    public String getDate() {
        return date;
    }
    public String getLocation() {
        return location;
    }
    public String getDresscode() {
        return dressСode;
    }
    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDressCode(String dressСode) {
        this.dressСode = dressСode;
    }
    public void result(){
        System.out.println("Event: "+eventname+", Date: "+date+", Location: "+location+", Dress code: "+dressСode);
    }
}
