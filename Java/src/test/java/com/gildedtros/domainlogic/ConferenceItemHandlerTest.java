package com.gildedtros.domainlogic;

import com.gildedtros.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConferenceItemHandlerTest {
    @Test
    void testUpdateQualityAbove11() {
        ConferenceItemHandler conferenceItemSomething = new ConferenceItemHandler(new Item("", 11, 10));

        conferenceItemSomething.updateQuality();

        assertEquals(conferenceItemSomething.getItem().quality, 11);
    }

    @Test
    void testUpdateQualitybetween6And11() {
        ConferenceItemHandler conferenceItemSomething = new ConferenceItemHandler(new Item("", 8, 10));

        conferenceItemSomething.updateQuality();

        assertEquals(conferenceItemSomething.getItem().quality, 12);
    }

    @Test
    void testUpdateQualitybelow5() {
        ConferenceItemHandler conferenceItemSomething = new ConferenceItemHandler(new Item("", 3, 10));

        conferenceItemSomething.updateQuality();

        assertEquals(conferenceItemSomething.getItem().quality, 13);
    }

    @Test
    void testNegativeSellin() {
        ConferenceItemHandler conferenceItemSomething = new ConferenceItemHandler(new Item("", 3, 10));

        conferenceItemSomething.negativeSellin();

        assertEquals(conferenceItemSomething.getItem().quality, 0);
        assertEquals(conferenceItemSomething.getItem().sellIn, 3);
    }
}