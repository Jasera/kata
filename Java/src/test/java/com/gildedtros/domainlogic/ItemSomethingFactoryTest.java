package com.gildedtros.domainlogic;

import com.gildedtros.Item;
import com.gildedtros.domainlogic.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemSomethingFactoryTest {

    @Test
    void testCreateSomethingConference1() {
        ItemSomething itemSomething = ItemSomethingFactory.createItemSomething(new Item("Backstage passes for Re:Factor", 1, 0));

        assertTrue(itemSomething instanceof ConferenceItemSomething);
    }

    @Test
    void testCreateSomethingConference2() {
        ItemSomething itemSomething = ItemSomethingFactory.createItemSomething(new Item("Backstage passes for HAXX", 1, 0));

        assertTrue(itemSomething instanceof ConferenceItemSomething);
    }

    @Test
    void testCreateSomethingLegendary() {
        ItemSomething itemSomething = ItemSomethingFactory.createItemSomething(new Item("B-DAWG Keychain", 1, 0));

        assertTrue(itemSomething instanceof LegendaryItemSomething);
    }

    @Test
    void testCreateSomethingWine() {
        ItemSomething itemSomething = ItemSomethingFactory.createItemSomething(new Item("Good Wine", 1, 0));

        assertTrue(itemSomething instanceof WineItemSomething);
    }

    @Test
    void testCreateSomethingDefault() {
        ItemSomething itemSomething = ItemSomethingFactory.createItemSomething(new Item("Something random", 1, 0));

        assertTrue(itemSomething instanceof DefaultItemSomething);
    }
}