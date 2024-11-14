import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("[Store Management System]");
        MerchandiseStorage keychainMerch = new MerchandiseStorage();
        System.out.print("How many keychains are being sold? ");
        int selling = scan.nextInt();
        for (int i = 0; i < selling; i++){
            keychainMerch.addMerchandise("keychain");
        }
        MerchandiseStorage shirtMerch = new MerchandiseStorage();
        System.out.print("How many t-shirts are being sold? ");
        selling = scan.nextInt();
        for (int i = 0; i < selling; i++){
            shirtMerch.addMerchandise("t-shirt");
        }
        MerchandiseStorage plushMerch = new MerchandiseStorage();
        System.out.print("How many plush are being sold? ");
        selling = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < selling; i++){
            plushMerch.addMerchandise("plush");
        }
        Store keychainStore = new Store(keychainMerch);
        Store shirtStore = new Store(shirtMerch);
        Store plushStore = new Store(plushMerch);
        System.out.println("Storage has been stocked. Press any key to start selling...");
        String pause = scan.nextLine();

        keychainStore.start();
        shirtStore.start();
        plushStore.start();
        try {
            keychainStore.join();
            shirtStore.join();
            plushStore.join();
            }
        catch  (Exception e){
            System.err.println(e.getMessage());
        }
        System.out.println("\nTotal revenue: $" + Store.totalRevenue
                +"\nNumber of items sold: " + Store.itemsSold
                +"\nThe show was a success!");
    }
}
