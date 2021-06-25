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
}