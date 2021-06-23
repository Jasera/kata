package com.gildedtros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RingOfCleanseningCodeTest {
    @Test
    void testSucces() {
        Item[] code = {new Item("Ring of Cleansening Code", 2, 20)};
        GildedTros gildedTros = new GildedTros(code);

        assertEquals(2, code[0].sellIn);
        assertEquals(20, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(1, code[0].sellIn);
        assertEquals(19, code[0].quality);

        gildedTros.updateQuality();
        assertEquals(0, code[0].sellIn);
        assertEquals(18, code[0].quality);
    }

    @Test
    void testNegativeSellin() {
        Item[] code = {new Item("Ring of Cleansening Code", 1, 20)};
        GildedTros gildedTros = new GildedTros(code);

        assertEquals(1, code[0].sellIn);
        assertEquals(20, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(0, code[0].sellIn);
        assertEquals(19, code[0].quality);

        gildedTros.updateQuality();
        assertEquals(-1, code[0].sellIn);
        assertEquals(17, code[0].quality);

        gildedTros.updateQuality();
        assertEquals(-2, code[0].sellIn);
        assertEquals(15, code[0].quality);
    }

    @Test
    void testQualityNegative() {
        Item[] code = {new Item("Ring of Cleansening Code", 1, 0)};
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
        Item[] code = {new Item("Ring of Cleansening Code", 1, 51)};
        GildedTros gildedTros = new GildedTros(code);

        assertEquals(1, code[0].sellIn);
        assertEquals(51, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(0, code[0].sellIn);
        assertEquals(50, code[0].quality);

        gildedTros.updateQuality();
        assertEquals(-1, code[0].sellIn);
        assertEquals(48, code[0].quality);
    }
}
