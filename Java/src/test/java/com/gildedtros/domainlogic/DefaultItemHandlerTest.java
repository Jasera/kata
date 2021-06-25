package com.gildedtros.domainlogic;

import com.gildedtros.Item;
import com.gildedtros.domainlogic.handler.DefaultItemHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultItemHandlerTest {

    @Test
    void testUpdateQuality() {
        DefaultItemHandler defaultItemSomething = new DefaultItemHandler(new Item("", 11, 10));

        defaultItemSomething.updateQuality();

        assertEquals(defaultItemSomething.getItem().quality, 9);
    }

    @Test
    void testNegativeSellin() {
        DefaultItemHandler defaultItemSomething = new DefaultItemHandler(new Item("", 11, 10));

        defaultItemSomething.negativeSellin();

        assertEquals(defaultItemSomething.getItem().quality, 9);
        assertEquals(defaultItemSomething.getItem().sellIn, 11);
    }
}