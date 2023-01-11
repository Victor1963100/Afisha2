package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class ProductManagerTest {

    ProductManager repo = Mockito.mock(ProductManager.class);
    ProductManager manager = new ProductManager();


    PurchaseItem item1 = new PurchaseItem("film1");
    PurchaseItem item2 = new PurchaseItem("film2");
    PurchaseItem item3 = new PurchaseItem("film3");
    PurchaseItem item4 = new PurchaseItem("film4");
    PurchaseItem item5 = new PurchaseItem("film5");
    PurchaseItem item6 = new PurchaseItem("film6");
    PurchaseItem item7 = new PurchaseItem("film7");
    PurchaseItem item8 = new PurchaseItem("film8");
    PurchaseItem item9 = new PurchaseItem("film9");
    PurchaseItem item10 = new PurchaseItem("film10");
    PurchaseItem item11 = new PurchaseItem("film11");
    
    @BeforeEach
    public void setup() {
        manager.all(item1);
        manager.all(item2);
        manager.all(item3);
        manager.all(item4);
        manager.all(item5);
        manager.all(item6);
        manager.all(item7);
        manager.all(item8);
        manager.all(item9);
        manager.all(item10);
        manager.all(item11);
    }

    @Test
    public void testFindAll() {
        PurchaseItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11};
        PurchaseItem[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastFive() {
        ProductManager manager = new ProductManager(5);
        manager.all(item1);
        manager.all(item2);
        manager.all(item3);
        manager.all(item4);
        manager.all(item5);
        manager.all(item6);
        manager.all(item7);
        manager.all(item8);
        manager.all(item9);
        manager.all(item10);
        manager.all(item11);
        PurchaseItem[] expected = {item11, item10, item9, item8, item7};
        PurchaseItem[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testWhenFLastilmsLessLimit() {
        ProductManager manager = new ProductManager(9);
        manager.all(item1);
        manager.all(item2);
        manager.all(item3);
        manager.all(item4);
        manager.all(item5);
        manager.all(item6);
        manager.all(item7);
        manager.all(item8);
        manager.all(item9);
        PurchaseItem[] expected = {item9, item8, item7, item6, item5, item4, item3, item2, item1};
        PurchaseItem[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testWhenLastFilmsLimitEquals() {
        ProductManager manager = new ProductManager(10);
        manager.all(item1);
        manager.all(item2);
        manager.all(item3);
        manager.all(item4);
        manager.all(item5);
        manager.all(item6);
        manager.all(item7);
        manager.all(item8);
        manager.all(item9);
        manager.all(item10);
        PurchaseItem[] expected = {item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        PurchaseItem[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void WhenLastFilmsMoreLimit() {
        ProductManager manager = new ProductManager(12);
        manager.all(item1);
        manager.all(item2);
        manager.all(item3);
        manager.all(item4);
        manager.all(item5);
        manager.all(item6);
        manager.all(item7);
        manager.all(item8);
        manager.all(item9);
        manager.all(item10);
        manager.all(item11);
        PurchaseItem[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        PurchaseItem[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}



