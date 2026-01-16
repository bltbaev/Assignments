public class Main{
        public static void main(String[] args) {
            EventDB db = new EventDB();

            // Добавляем мероприятие
            Event event = new Event("Tech Conference", "2026-05-20", "Astana", "Casual");
            db.addEvent(event);
            Event event1 = new Event("Wedding", "2026-06-26", "Astana", "white-tie");
            db.addEvent(event1);
            Event event2 = new Event("Hackaton", "2026-01-20", "Tokyo", "Casual");
            db.addEvent(event2);
            Event event3 = new Event("IT-Fest", "2026-04-24", "Almaty", "Basic");
            db.addEvent(event3);
            Event event4 = new Event("NY-party", "2026-12-31", "New-York", "NY-style");
            db.addEvent(event4);
            // Выводим все мероприятия
            System.out.println("\nAll events:");
            for (Event e : db.getAllEvents()) {
                System.out.println(e.getId() + " | " + e.getName() + " | " + e.getDate() + " | " + e.getLocation());
            }


            db.updateEvent(1, "Updated Tech Conference");


            db.deleteEvent(3);
        }
}


//        EventSystem system = new EventSystem();
//
//        Event eventt= new Wedding("New Year party","31.12.2025","Royal Palace","White tye!","John & Saltanat");
//        Event events= new Wedding("Wedding ceremony","26.06.2026","Royal Palace","Cocktail Attire!","Marry & Boul");
//
//        Participant participant=new Participant("Ermek Toleubaev",37,"Yes");
//        Organizer organizer = new Organizer("Zangar Baltabay","Spark Events",event1);
//
//
//        if(eventt.getLocation().equals(events.getLocation())){
//            System.out.println("The Events have the same location");
//        }
//        else{
//            System.out.println("Location of events are different");
//        }
//
//
//
//        system.addEvent(event1);
//        system.addEvent(event2);
//
//        System.out.println(" All Events Sorted");
//        system.sortByDate();
//        system.printAll();
//
//        System.out.println("\n Filtered by Location (Palace)");
//        system.searchByLocation("Palace").forEach(System.out::println);
//
//        System.out.println("\nAre events equal? " + event1.equals(event2));
//
//    }
//}