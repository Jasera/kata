package com.gildedtros.domainlogic;

import com.gildedtros.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmellyItemHandlerTest {
    @Test
    void testUpdateQuality() {
        SmellyItemHandler smellyItemSomething = new SmellyItemHandler(new Item("", 11, 10));

        smellyItemSomething.updateQuality();

        assertEquals(smellyItemSomething.getItem().quality, 8);
    }

    @Test
    void testNegativeSellin() {
        SmellyItemHandler smellyItemSomething = new SmellyItemHandler(new Item("", 11, 10));

        smellyItemSomething.negativeSellin();

        assertEquals(smellyItemSomething.getItem().quality, 8);
        assertEquals(smellyItemSomething.getItem().sellIn, 11);
    }
}