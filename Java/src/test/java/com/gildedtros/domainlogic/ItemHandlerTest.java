package com.gildedtros.domainlogic;

import com.gildedtros.Item;
import com.gildedtros.domainlogic.handler.ItemHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemHandlerTest {

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

    @Test
    void testItemSellinUpdate() {
        TestClass testClass = new TestClass(new Item("test", 10, 0));

        testClass.updateSellin();

        assertEquals(testClass.getItem().sellIn, 9);
    }

    @Test
    void testHandleNegativeSellinWith0OrAboveSellin() {
        TestClass testClass = new TestClass(new Item("test", 0, 0));

        testClass.handleNegativeSellin();

        assertEquals(testClass.getItem().quality, 0);
        assertEquals(testClass.getItem().sellIn, 0);
    }

    @Test
    void testHandleNegativeSellinWithNegativeSellin() {
        TestClass testClass = new TestClass(new Item("test", -1, 0));

        testClass.handleNegativeSellin();

        assertEquals(testClass.getItem().quality, 404);
        assertEquals(testClass.getItem().sellIn, 500);
    }

    class TestClass extends ItemHandler {

        protected TestClass(Item item) {
            super(item);
        }

        @Override
        public void updateQuality() {
            throw new IllegalArgumentException("Not being tested here");
        }

        @Override
        protected void negativeSellin() {
            getItem().quality = 404;
            getItem().sellIn = 500;
        }
    }
}