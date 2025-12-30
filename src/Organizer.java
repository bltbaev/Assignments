import java.util.Objects;
public class Organizer {
    private String organizername;
    private String company;
    private Event managdedevent;

    public Organizer(String organizername, String company, Event managdedevent) {
        this.organizername = organizername;
        this.company = company;
        this.managdedevent = managdedevent;
    }

    public String getOrganizername() {
        return organizername;
    }

    public String getCompany() {
        return company;
    }

    public Event getManagdedevent() {
        return managdedevent;
    }

    public void setManagdedevent(Event managdedevent) {
        this.managdedevent = managdedevent;
    }

    public void setOrganizername(String organizername) {
        this.organizername = organizername;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Organizer: Name='" + organizername + "', Company='" + company + "', Managing: " +
                (managdedevent != null ? managdedevent.getEventname() : "No event");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organizer organizer = (Organizer) o;
        return Objects.equals(organizername, organizer.organizername) &&
                Objects.equals(company, organizer.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizername, company);
    }
}