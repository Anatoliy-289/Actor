import java.util.List;

public interface MarketBehaviour {
    
    void acceptToMarket(Actor actor); //вошел в магазин

    void releaseFromMarket(List<Actor> actors); //выходит из магазина

    void update(List<Product> products); //метод "обновить" (обновление)
}
