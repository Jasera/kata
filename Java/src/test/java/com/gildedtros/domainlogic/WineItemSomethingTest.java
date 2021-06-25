package com.gildedtros.domainlogic;

import com.gildedtros.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WineItemSomethingTest {

    @Test
    void testUpdateQuality() {
        WineItemSomething wineItemSomething = new WineItemSomething(new Item("", 11, 10));

        wineItemSomething.updateQuality();

        assertEquals(wineItemSomething.getItem().quality, 11);
    }

    @Test
    void testNegativeSellin() {
        WineItemSomething wineItemSomething = new WineItemSomething(new Item("", 0, 10));

        wineItemSomething.negativeSellin();

        assertEquals(wineItemSomething.getItem().quality, 11);
        assertEquals(wineItemSomething.getItem().sellIn, 0);
    }
}