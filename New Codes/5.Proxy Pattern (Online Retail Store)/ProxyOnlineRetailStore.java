public class ProxyOnlineRetailStore implements OnlineRetailStore{
    private RealOnlineRetailStore realOnlineRetailStore;

    public ProxyOnlineRetailStore(){
        realOnlineRetailStore = new RealOnlineRetailStore();
    }

    @Override
    public void purchaseProduct(String product, int quantity) {
        realOnlineRetailStore.purchaseProduct(product, quantity);
    }

}