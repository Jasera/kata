package com.gildedtros;

import com.gildedtros.domainlogic.handler.ItemHandler;
import com.gildedtros.domainlogic.ItemSomethingFactory;

class GildedTros {
    Item[] items;

    public GildedTros(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {

            ItemHandler itemHandler = ItemSomethingFactory.createItemSomething(item);

            itemHandler.updateQuality();

            itemHandler.updateSellin();

            itemHandler.handleNegativeSellin();
        }
    }
}