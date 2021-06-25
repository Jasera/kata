package com.gildedtros;

import com.gildedtros.domainlogic.ItemSomething;
import com.gildedtros.domainlogic.ItemSomethingFactory;

class GildedTros {
    Item[] items;

    public GildedTros(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {

            ItemSomething itemSomething = ItemSomethingFactory.createItemSomething(item);

            itemSomething.updateQuality();

            itemSomething.updateSellin();

            itemSomething.handleNegativeSellin();
        }
    }
}