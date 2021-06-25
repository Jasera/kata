package com.gildedtros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmellyItemTest {

    @Test
    void testSucces() {
        Item[] code = {new Item("Duplicate Code", 2, 20)};
        GildedTros gildedTros = new GildedTros(code);

        assertEquals(2, code[0].sellIn);
        assertEquals(20, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(1, code[0].sellIn);
        assertEquals(18, code[0].quality);

        gildedTros.updateQuality();
        assertEquals(0, code[0].sellIn);
        assertEquals(16, code[0].quality);
    }

    @Test
    void testNegativeSellin() {
        Item[] code = {new Item("Long Methods", 1, 20)};
        GildedTros gildedTros = new GildedTros(code);

        assertEquals(1, code[0].sellIn);
        assertEquals(20, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(0, code[0].sellIn);
        assertEquals(18, code[0].quality);

        gildedTros.updateQuality();
        assertEquals(-1, code[0].sellIn);
        assertEquals(14, code[0].quality);

        gildedTros.updateQuality();
        assertEquals(-2, code[0].sellIn);
        assertEquals(10, code[0].quality);
    }

    @Test
    void testQualityNegative() {
        Item[] code = {new Item("Ugly Variable Names", 1, 0)};
        GildedTros gildedTros = new GildedTros(code);

        assertEquals(1, code[0].sellIn);
        assertEquals(0, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(0, code[0].sellIn);
        assertEquals(0, code[0].quality);

        gildedTros.updateQuality();
        assertEquals(-1, code[0].sellIn);
        assertEquals(0, code[0].quality);
    }

    @Test
    void test50() {
        Item[] code = {new Item("Ugly Variable Names", 1, 51)};
        GildedTros gildedTros = new GildedTros(code);

        assertEquals(1, code[0].sellIn);
        assertEquals(51, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(0, code[0].sellIn);
        assertEquals(49, code[0].quality);

        gildedTros.updateQuality();
        assertEquals(-1, code[0].sellIn);
        assertEquals(45, code[0].quality);
    }
}
