package com.gildedtros.domainlogic;

import com.gildedtros.Item;
import com.gildedtros.domainlogic.handler.WineItemHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WineItemHandlerTest {

    @Test
    void testUpdateQuality() {
        WineItemHandler wineItemSomething = new WineItemHandler(new Item("", 11, 10));

        wineItemSomething.updateQuality();

        assertEquals(wineItemSomething.getItem().quality, 11);
    }

    @Test
    void testNegativeSellin() {
        WineItemHandler wineItemSomething = new WineItemHandler(new Item("", 0, 10));

        wineItemSomething.negativeSellin();

        assertEquals(wineItemSomething.getItem().quality, 11);
        assertEquals(wineItemSomething.getItem().sellIn, 0);
    }
}