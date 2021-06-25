package com.gildedtros.domainlogic;

import com.gildedtros.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConferenceItemSomethingTest {
    @Test
    void testUpdateQualityAbove11() {
        ConferenceItemSomething conferenceItemSomething = new ConferenceItemSomething(new Item("", 11, 10));

        conferenceItemSomething.updateQuality();

        assertEquals(conferenceItemSomething.getItem().quality, 11);
    }

    @Test
    void testUpdateQualitybetween6And11() {
        ConferenceItemSomething conferenceItemSomething = new ConferenceItemSomething(new Item("", 8, 10));

        conferenceItemSomething.updateQuality();

        assertEquals(conferenceItemSomething.getItem().quality, 12);
    }

    @Test
    void testUpdateQualitybelow5() {
        ConferenceItemSomething conferenceItemSomething = new ConferenceItemSomething(new Item("", 3, 10));

        conferenceItemSomething.updateQuality();

        assertEquals(conferenceItemSomething.getItem().quality, 13);
    }

    @Test
    void testNegativeSellin() {
        ConferenceItemSomething conferenceItemSomething = new ConferenceItemSomething(new Item("", 3, 10));

        conferenceItemSomething.negativeSellin();

        assertEquals(conferenceItemSomething.getItem().quality, 0);
        assertEquals(conferenceItemSomething.getItem().sellIn, 3);
    }
}