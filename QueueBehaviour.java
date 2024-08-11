import java.util.List;

public interface QueueBehaviour {

    void takeInQueue(Actor actor);//встать в очередь

    void takeOrders(boolean flag);// сделать заказ

    void giveOrders(List<Product> products);// забрать заказ

    void releaseFromQueue(Actor actor);// выйти из очереди
    
}
