import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EventSystem {
    private List<Event> events = new ArrayList<>();

    public void addEvent(Event e) {
        events.add(e);
    }

    public List<Event> searchByLocation(String location) {
        return events.stream()
                .filter(e -> e.getLocation().equalsIgnoreCase(location))
                .collect(Collectors.toList());
    }

    public void sortByDate() {
        events.sort(Comparator.comparing(Event::getDate));
    }

    public void printAll() {
        events.forEach(System.out::println);
    }
}
