package com.gildedtros.domainlogic;

import com.gildedtros.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemSomethingTest {

    @Test
    void testItemSomethingZero() {
        TestClass testClass = new TestClass(new Item("test", 0, 10));

        testClass.qualityZero();

        assertEquals(testClass.getItem().quality, 0);
    }

    @Test
    void testItemSomethingIncrease() {
        TestClass testClass = new TestClass(new Item("test", 0, 10));

        testClass.increaseQuality();

        assertEquals(testClass.getItem().quality, 11);
    }

    @Test
    void testItemSomethingIncreaseAbove50() {
        TestClass testClass = new TestClass(new Item("test", 0, 50));

        testClass.increaseQuality();

        assertEquals(testClass.getItem().quality, 50);
    }

    @Test
    void testItemSomethingReduce() {
        TestClass testClass = new TestClass(new Item("test", 0, 10));

        testClass.reduceQuality();

        assertEquals(testClass.getItem().quality, 9);
    }

    @Test
    void testItemSomethingReduceBelow0() {
        TestClass testClass = new TestClass(new Item("test", 0, 0));

        testClass.reduceQuality();

        assertEquals(testClass.getItem().quality, 0);
    }

    class TestClass extends ItemSomething {

        protected TestClass(Item item) {
            super(item);
        }

        @Override
        public void updateQuality() {
            throw new IllegalArgumentException("Not being tested here");
        }
    }
}