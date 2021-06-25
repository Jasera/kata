package com.gildedtros.domainlogic;

import com.gildedtros.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultItemSomethingTest {

    @Test
    void testUpdateQuality() {
        DefaultItemSomething defaultItemSomething = new DefaultItemSomething(new Item("", 11, 10));

        defaultItemSomething.updateQuality();

        assertEquals(defaultItemSomething.getItem().quality, 9);
    }
}