package com.gildedtros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBawgKeyChain {

    @Test
    void testSucces() {
        Item[] code = {new Item("B-DAWG Keychain", 0, 80)};
        GildedTros gildedTros = new GildedTros(code);

        assertEquals(0, code[0].sellIn);
        assertEquals(80, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(0, code[0].sellIn);
        assertEquals(80, code[0].quality);
    }

    @Test
    void testSucces2() {
        Item[] code = {new Item("B-DAWG Keychain", -1, 80)};
        GildedTros gildedTros = new GildedTros(code);

        assertEquals(-1, code[0].sellIn);
        assertEquals(80, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(-1, code[0].sellIn);
        assertEquals(80, code[0].quality);
    }

    @Test
    void testSucces3() {
        Item[] code = {new Item("B-DAWG Keychain", -1, 60)};
        GildedTros gildedTros = new GildedTros(code);

        assertEquals(-1, code[0].sellIn);
        assertEquals(60, code[0].quality);

        gildedTros.updateQuality();

        assertEquals(-1, code[0].sellIn);
        assertEquals(80, code[0].quality);
    }
}
