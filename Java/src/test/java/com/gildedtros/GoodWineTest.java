package com.gildedtros;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoodWineTest {


    @Test
    void testSucces() {
        Item[] goodWine = {new Item("Good Wine", 2, 0)};
        GildedTros gildedTros = new GildedTros(goodWine);

        assertEquals(2, goodWine[0].sellIn);
        assertEquals(0, goodWine[0].quality);

        gildedTros.updateQuality();

        assertEquals(1, goodWine[0].sellIn);
        assertEquals(1, goodWine[0].quality);

        gildedTros.updateQuality();
        assertEquals(0, goodWine[0].sellIn);
        assertEquals(2, goodWine[0].quality);

        gildedTros.updateQuality();
        assertEquals(-1, goodWine[0].sellIn);
        assertEquals(4, goodWine[0].quality);
    }

    @Test
    void testNegativeSellin() {
        Item[] goodWine = {new Item("Good Wine", 0, 0)};
        GildedTros gildedTros = new GildedTros(goodWine);

        assertEquals(0, goodWine[0].sellIn);
        assertEquals(0, goodWine[0].quality);

        gildedTros.updateQuality();

        assertEquals(-1, goodWine[0].sellIn);
        assertEquals(2, goodWine[0].quality);

        gildedTros.updateQuality();
        assertEquals(-2, goodWine[0].sellIn);
        assertEquals(4, goodWine[0].quality);
    }

    @Test
    void testQuality50() {
        Item[] goodWine = {new Item("Good Wine", 0, 49)};
        GildedTros gildedTros = new GildedTros(goodWine);

        assertEquals(0, goodWine[0].sellIn);
        assertEquals(49, goodWine[0].quality);

        gildedTros.updateQuality();

        assertEquals(-1, goodWine[0].sellIn);
        assertEquals(50, goodWine[0].quality);

        gildedTros.updateQuality();
        assertEquals(-2, goodWine[0].sellIn);
        assertEquals(50, goodWine[0].quality);
    }
}
