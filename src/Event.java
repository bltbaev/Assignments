import java.util.Objects;
public abstract class Event {
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
    public String getDresscode() {return dressСode;}

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
    @Override
    public  String toString(){
        return "Event: "+eventname+", Date: "+date+", Location: "+location+", Dress code: "+dressСode;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(eventname, event.eventname) && Objects.equals(date, event.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventname, date);
    }
}
