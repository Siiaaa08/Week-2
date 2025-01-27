package librarymanagementsystem;
import java.util.ArrayList;
public class LibraryManagementSystemMain {

        public static void main(String[] args) {
            ArrayList<LibraryItem> libraryItems = new ArrayList<>();

            LibraryItem book = new Book(1, "Raygan", "Dev Aditya Singh");
            LibraryItem magazine = new Magazine(2, "SAfar", "Dev");
            LibraryItem dvd = new DVD(3, "Inception", "Christopher Nolan");

            libraryItems.add(book);
            libraryItems.add(magazine);
            libraryItems.add(dvd);

            for (LibraryItem item : libraryItems) {
                item.getItemDetails();
                System.out.println("Time Duration :- " + item.getTimeDuration() + " days");

                if (item instanceof Reservable) {
                    Reservable reservableItem = (Reservable) item;
                    if (reservableItem.checkAvailability()) {
                        reservableItem.reserveItem("Ronit");
                    } else {
                        System.out.println("Item is not available for reservation.");
                    }
                }

                System.out.println();
            }
        }
    }

