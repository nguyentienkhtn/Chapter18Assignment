package stock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockMapTest {
    StockMap stockMap;
    Stock stock1;


    @BeforeEach
    void setUp() {
        stockMap = new StockMap();
        stock1 = new Stock("SGT", 150);
        Stock stock2 = new Stock("SGT1", 110);
        Stock stock3 = new Stock("SGT2", 120);
        stockMap.add(stock1);
        stockMap.add(stock2);
        stockMap.add(stock3);
    }

    @Test
    void getStock1() {
        Stock temp = stockMap.getStock("SGT");
        Assertions.assertEquals(stock1, temp);

    }
    @Test
    void getStock2() {
        Stock temp = stockMap.getStock("SGT5");
        Assertions.assertEquals(null, temp);

    }
}