package com.gildedtros.domainlogic;

import com.gildedtros.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LegendaryItemSomethingTest {

    @Test
    void testUpdateQuality() {
        LegendaryItemSomething legendaryItemSomething = new LegendaryItemSomething(new Item("", 11, 10));

        legendaryItemSomething.updateQuality();

        assertEquals(legendaryItemSomething.getItem().quality, 10);
    }
}