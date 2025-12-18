public class Main{

    public static void main(String[] args) {
        Event event1= new Event("New Year party","31.12.2025","Royal Palace","White tye!");
        Event event2= new Event("Wedding ceremony","26.06.2026","Royal Palace","Cocktail Attire!");

        Participant participant=new Participant("Ermek Toleubaev",37,"Yes");
        Organizer organizer = new Organizer("Zangar Baltabay","Spark Events");

        event1.result();
        event2.result();
        participant.result();
        organizer.result();

        if(event1.getLocation().equals(event2.getLocation())){
            System.out.println("The Events have the same location");
        }
        else{
            System.out.println("Location of events are different");
        }
    }
}