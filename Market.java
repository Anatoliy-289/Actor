import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> actors = new ArrayList<>();


    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor); // добавление человека в магазин
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        actors.remove(0); // удаление человека из магазина
        
    }

    @Override
    public void update(List<Product> products) {
        
        public void addtProducts(List<Product> products) {
            this.products.add(products);
        }
        
        public void removeProducts(List<Product> products) {
            this.products.remove(products);
        }
        
    }


    @Override
    public void giveOrders(List<Product> products) {
        products.remove(0); // забрать заказы (удаление продукта из списка, человек забрал заказ)
        
    }

    @Override
    public void releaseFromQueue(Actor actor) {
        actors.remove(0); // человек покинул очередь
        
    }

    @Override
    public void takeInQueue(Actor actor) {
        actors.add(actor); //человек встал в очередь (добавление человека в очередь)
        
    }

    @Override
    public void takeOrders(boolean flag) {
        if (isTakeOrder) { // человек сделал заказ
            return flag;
        }
        return false;
        
    }
    
}
