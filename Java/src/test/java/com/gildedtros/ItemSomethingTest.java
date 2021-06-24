package com.gildedtros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemSomethingTest {

    @Test
    void testItemSomethingZero() {
        ItemSomething itemSomething = new ItemSomething(new Item("test", 0, 10));

        itemSomething.qualityZero();

        assertEquals(itemSomething.getItem().quality, 0);
    }

    @Test
    void testItemSomethingIncrease() {
        ItemSomething itemSomething = new ItemSomething(new Item("test", 0, 10));

        itemSomething.increaseQuality();

        assertEquals(itemSomething.getItem().quality, 11);
    }

    @Test
    void testItemSomethingIncreaseAbove50() {
        ItemSomething itemSomething = new ItemSomething(new Item("test", 0, 50));

        itemSomething.increaseQuality();

        assertEquals(itemSomething.getItem().quality, 50);
    }

    @Test
    void testItemSomethingReduce() {
        ItemSomething itemSomething = new ItemSomething(new Item("test",0, 10));

        itemSomething.reduceQuality();

        assertEquals(itemSomething.getItem().quality, 9);
    }

    @Test
    void testItemSomethingReduceBelow0() {
        ItemSomething itemSomething = new ItemSomething(new Item("test", 0, 0));

        itemSomething.reduceQuality();

        assertEquals(itemSomething.getItem().quality, 0);
    }
}