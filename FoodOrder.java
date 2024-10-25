import java.util.ArrayList;
import java.util.Scanner;

public class FoodOrder {
    
    private ArrayList<String> menuItems;
    private ArrayList<Integer> menuPrices;
    private ArrayList<String> orderedItems;
    private int totalPrice;
    private boolean isPaid;


    public FoodOrder() {
        menuItems = new ArrayList<>();
        menuPrices = new ArrayList<>();
        orderedItems = new ArrayList<>();
        totalPrice = 0;
        isPaid = false;
    }

    public void addMenuItem(String item, int price) {
        menuItems.add(item);
        menuPrices.add(price);
    }

    // Menghitung total harga dari item yang dipesan
    public void calculateTotalPrice() {
        totalPrice = 0;
        for (String item : orderedItems) {
            int index = menuItems.indexOf(item);
            if (index != -1) {
                totalPrice += menuPrices.get(index);
            }
        }
    }

    public void markAsPaid() {
        isPaid = true;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public ArrayList<String> getMenuItems() {
        return menuItems;
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i) + " - Rp " + menuPrices.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FoodOrder order = new FoodOrder();

        order.addMenuItem("Burger", 20000);
        order.addMenuItem("Kentang Goreng", 10000);
        order.addMenuItem("Ayam Goreng + Nasi", 15000);
        order.addMenuItem("Air Mineral", 4000);
        order.addMenuItem("Es Teh", 7000);
        order.addMenuItem("Es Kopi", 10000);

        // Menampilkan menu
        order.displayMenu();

        // Memilih item menu
        System.out.println("Masukkan nomor menu yang ingin dipesan (ketik '0' untuk selesai):");
        while (true) {
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;  // Keluar dari loop jika pengguna mengetik 0
            }
            if (choice > 0 && choice <= order.getMenuItems().size()) {
                String selectedItem = order.getMenuItems().get(choice - 1);
                order.orderedItems.add(selectedItem);
                System.out.println(selectedItem + " telah ditambahkan ke pesanan.");
            } 
            
            else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        order.calculateTotalPrice();
        System.out.println("Total Harga: Rp " + order.getTotalPrice());

        
        order.markAsPaid();
        System.out.println("Is Paid: " + order.isPaid());
        System.out.println("Menu Items yang dipesan: " + order.orderedItems);
        scanner.close();
    }
}
