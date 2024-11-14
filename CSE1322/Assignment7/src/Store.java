public class Store extends Thread {
    MerchandiseStorage pile;
    static int totalRevenue = 0;
    static int itemsSold = 0;
    static int nextId = 1;
    int id;

    public Store(MerchandiseStorage init){
        pile = init;
        id = nextId++;
    }
    public int getTotalRevenue(){
        return totalRevenue;
    }
    public int getItemsSold(){
        return itemsSold;
    }
    public void run(){
        String type = pile.retrieveMerchandise();
        while (!type.equals("")) {
            synchronized (Store.class) {
                itemsSold++;
                if (type.equals("keychain")) {
                    totalRevenue += 5;
                } else if (type.equals("t-shirt")) {
                    totalRevenue += 30;
                } else if (type.equals("plush")) {
                    totalRevenue += 50;
                }
            }
            type = pile.retrieveMerchandise();
        }
        System.out.println("Store " + id + " is done selling");
    }
}
