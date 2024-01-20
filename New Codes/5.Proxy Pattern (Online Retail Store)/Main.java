public class Main {
    public static void main(String[] args) {
        OnlineRetailStore onlineRetailStore = new ProxyOnlineRetailStore();

        onlineRetailStore.purchaseProduct("Laptop", 100);
        onlineRetailStore.purchaseProduct("Laptop", 4);
         
        onlineRetailStore.purchaseProduct("Headphone", 1);
        onlineRetailStore.purchaseProduct("Mouse", 5);
    }
}