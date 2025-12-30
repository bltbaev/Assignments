public class Main{

    public static void main(String[] args) {
        EventSystem system = new EventSystem();

        Event event1= new Wedding("New Year party","31.12.2025","Royal Palace","White tye!","John & Saltanat");
        Event event2= new Wedding("Wedding ceremony","26.06.2026","Royal Palace","Cocktail Attire!","Marry & Boul");

        Participant participant=new Participant("Ermek Toleubaev",37,"Yes");
        Organizer organizer = new Organizer("Zangar Baltabay","Spark Events",event1);


        if(event1.getLocation().equals(event2.getLocation())){
            System.out.println("The Events have the same location");
        }
        else{
            System.out.println("Location of events are different");
        }



        system.addEvent(event1);
        system.addEvent(event2);

        System.out.println(" All Events Sorted");
        system.sortByDate();
        system.printAll();

        System.out.println("\n Filtered by Location (Palace)");
        system.searchByLocation("Palace").forEach(System.out::println);

        // Пример работы equals
        System.out.println("\nAre events equal? " + event1.equals(event2));

    }
}