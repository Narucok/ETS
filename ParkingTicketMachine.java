import java.util.Scanner;

public class ParkingTicketMachine {
    
    private int balance;      // Jumlah uang yang dimasukkan oleh pengguna
    private int ticketPrice;  // Harga tiket per jam
    private int ticketTime;   // Jumlah waktu parkir yang dibeli (dalam jam)

    
    public ParkingTicketMachine(int ticketPrice) {
        this.ticketPrice = ticketPrice;
        this.balance = 0;     // Saldo awal
        this.ticketTime = 0;  // Waktu parkir awal
    }
    
    public void insertMoney(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Uang dimasukkan: Rp" + amount);
        } 
        
        else {
            System.out.println("Jumlah yang dimasukkan harus positif.");
        }
    }

    public void issueTicket() {
        if (balance >= ticketPrice) {
            ticketTime = balance / ticketPrice;  // Hitung jumlah waktu parkir yang dibeli
            balance %= ticketPrice;              // Sisa saldo
            System.out.println("Tiket dikeluarkan untuk " + ticketTime + " jam parkir.");
        } 
        
        else {
            System.out.println("Saldo tidak mencukupi untuk membeli tiket.");
        }
    }

    public int getTimePurchased() {
        return ticketTime;
    }

    public int getBalance() {
        return balance;
    }

    public void displayStatus() {
        System.out.println("Saldo saat ini: Rp" + balance);
        System.out.println("Waktu parkir yang dibeli: " + ticketTime + " jam.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkingTicketMachine machine = new ParkingTicketMachine(5000); // Harga tiket Rp5.000 per jam
        
        while (true) {
            System.out.print("Masukkan jumlah uang (atau masukkan 0 untuk keluar): ");
            int amount = scanner.nextInt();
            if (amount == 0) {
                break;
            }
            machine.insertMoney(amount);

            System.out.print("Keluarkan tiket? (y/n): ");
            char choice = scanner.next().charAt(0);
            if (choice == 'y' || choice == 'Y') {
                machine.issueTicket();
            }

            machine.displayStatus();
        }

        scanner.close();
        System.out.println("Terima kasih! Program selesai.");
    }
}
