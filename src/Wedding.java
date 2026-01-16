public class Wedding extends Event{
    private String couplename;

    public Wedding(int id,String eventname, String date, String location, String dressСode,String couplename) {
        super(id,eventname, date, location, dressСode);
        this.couplename = couplename;
    }
    @Override
    public String toString() {
        return super.toString() + ", Couple: " + couplename;
    }
}