package com.gildedtros.domainlogic;

import com.gildedtros.Item;
import com.gildedtros.domainlogic.handler.LegendaryItemHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LegendaryItemHandlerTest {

    @Test
    void testUpdateQuality() {
        LegendaryItemHandler legendaryItemSomething = new LegendaryItemHandler(new Item("", 11, 10));

        legendaryItemSomething.updateQuality();

        assertEquals(legendaryItemSomething.getItem().quality, 10);
    }

    @Test
    void testUpdateSellin() {
        LegendaryItemHandler legendaryItemSomething = new LegendaryItemHandler(new Item("", 5, 10));

        legendaryItemSomething.updateSellin();

        assertEquals(legendaryItemSomething.getItem().sellIn, 5);
    }

    @Test
    void testNegativeSellin() {
        LegendaryItemHandler legendaryItemSomething = new LegendaryItemHandler(new Item("", 5, 10));

        legendaryItemSomething.negativeSellin();

        assertEquals(legendaryItemSomething.getItem().sellIn, 5);
        assertEquals(legendaryItemSomething.getItem().quality, 10);
    }
}