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

    @Test
    void testUpdateSellin() {
        LegendaryItemSomething legendaryItemSomething = new LegendaryItemSomething(new Item("", 5, 10));

        legendaryItemSomething.updateSellin();

        assertEquals(legendaryItemSomething.getItem().sellIn, 5);
    }

    @Test
    void testNegativeSellin() {
        LegendaryItemSomething legendaryItemSomething = new LegendaryItemSomething(new Item("", 5, 10));

        legendaryItemSomething.negativeSellin();

        assertEquals(legendaryItemSomething.getItem().sellIn, 5);
        assertEquals(legendaryItemSomething.getItem().quality, 10);
    }
}