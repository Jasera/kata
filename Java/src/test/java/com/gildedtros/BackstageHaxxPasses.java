package com.gildedtros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstageHaxxPasses {
    @Test
    void test15days() {
        Item[] code = {new Item("Backstage passes for HAXX", 15, 20)};
        GildedTros gildedTros = new GildedTros(code);

        assertEquals(15, code[0].sellIn);
        assertEquals(20, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(14, code[0].sellIn);
        assertEquals(21, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(13, code[0].sellIn);
        assertEquals(22, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(12, code[0].sellIn);
        assertEquals(23, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(11, code[0].sellIn);
        assertEquals(24, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(10, code[0].sellIn);
        assertEquals(25, code[0].quality);
    }

    @Test
    void test10days() {
        Item[] code = {new Item("Backstage passes for HAXX", 11, 20)};
        GildedTros gildedTros = new GildedTros(code);

        assertEquals(11, code[0].sellIn);
        assertEquals(20, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(10, code[0].sellIn);
        assertEquals(21, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(9, code[0].sellIn);
        assertEquals(23, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(8, code[0].sellIn);
        assertEquals(25, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(7, code[0].sellIn);
        assertEquals(27, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(6, code[0].sellIn);
        assertEquals(29, code[0].quality);
    }

    @Test
    void test5days() {
        Item[] code = {new Item("Backstage passes for HAXX", 6, 20)};
        GildedTros gildedTros = new GildedTros(code);

        assertEquals(6, code[0].sellIn);
        assertEquals(20, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(5, code[0].sellIn);
        assertEquals(22, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(4, code[0].sellIn);
        assertEquals(25, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(3, code[0].sellIn);
        assertEquals(28, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(2, code[0].sellIn);
        assertEquals(31, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(1, code[0].sellIn);
        assertEquals(34, code[0].quality);
    }

    @Test
    void test0days() {
        Item[] code = {new Item("Backstage passes for HAXX", 2, 20)};
        GildedTros gildedTros = new GildedTros(code);

        assertEquals(2, code[0].sellIn);
        assertEquals(20, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(1, code[0].sellIn);
        assertEquals(23, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(0, code[0].sellIn);
        assertEquals(26, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(-1, code[0].sellIn);
        assertEquals(0, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(-2, code[0].sellIn);
        assertEquals(0, code[0].quality);
    }
}
