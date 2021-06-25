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

            handleNegativeSellin(item);
        }
    }

    private void handleNegativeSellin(Item item) {
        if (item.sellIn < 0) {
            if (isWine(item)) {
                increaseQuality(item);
            }
            else if (isBackstagePass(item)) {
                qualityZero(item);
            } else {
                reduceQuality(item);
            }
        }
    }

    private void qualityZero(Item item) {
        item.quality = item.quality - item.quality;
    }

    private void reduceQuality(Item item) {
        if (item.quality > 0) {
            if (!isLegendaryItem(item)) {
                item.quality = item.quality - 1;
            }
        }
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    private boolean isWine(Item item) {
        return item.name.equals("Good Wine");
    }

    private boolean isLegendaryItem(Item item) {
        return item.name.equals("B-DAWG Keychain");
    }

    private boolean isBackstagePass(Item item) {
        return item.name.equals("Backstage passes for Re:Factor") || item.name.equals("Backstage passes for HAXX");
    }
}