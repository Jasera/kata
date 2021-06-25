package com.gildedtros.domainlogic;

import com.gildedtros.Item;
import com.gildedtros.domainlogic.handler.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemHandlerFactoryTest {

    @Test
    void testCreateSomethingConference1() {
        ItemHandler itemHandler = ItemSomethingFactory.createItemSomething(new Item("Backstage passes for Re:Factor", 1, 0));

        assertTrue(itemHandler instanceof ConferenceItemHandler);
    }

    @Test
    void testCreateSomethingConference2() {
        ItemHandler itemHandler = ItemSomethingFactory.createItemSomething(new Item("Backstage passes for HAXX", 1, 0));

        assertTrue(itemHandler instanceof ConferenceItemHandler);
    }

    @Test
    void testCreateSomethingLegendary() {
        ItemHandler itemHandler = ItemSomethingFactory.createItemSomething(new Item("B-DAWG Keychain", 1, 0));

        assertTrue(itemHandler instanceof LegendaryItemHandler);
    }

    @Test
    void testCreateSomethingWine() {
        ItemHandler itemHandler = ItemSomethingFactory.createItemSomething(new Item("Good Wine", 1, 0));

        assertTrue(itemHandler instanceof WineItemHandler);
    }

    @Test
    void testCreateSomethingDefault() {
        ItemHandler itemHandler = ItemSomethingFactory.createItemSomething(new Item("Something random", 1, 0));

        assertTrue(itemHandler instanceof DefaultItemHandler);
    }

    @Test
    void testSmellyItemLongMethods() {
        ItemHandler itemHandler = ItemSomethingFactory.createItemSomething(new Item("Long Methods", 1, 0));

        assertTrue(itemHandler instanceof SmellyItemHandler);
    }

    @Test
    void testSmellyItemDuplicateCode() {
        ItemHandler itemHandler = ItemSomethingFactory.createItemSomething(new Item("Duplicate Code", 1, 0));

        assertTrue(itemHandler instanceof SmellyItemHandler);
    }

    @Test
    void testSmellyItemUglyVariableNames() {
        ItemHandler itemHandler = ItemSomethingFactory.createItemSomething(new Item("Ugly Variable Names", 1, 0));

        assertTrue(itemHandler instanceof SmellyItemHandler);
    }
}