package com.gildedtros;

class GildedTros {
    Item[] items;

    public GildedTros(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {

            updateQuality(item);

            if (!isLegendaryItem(item)) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (!isWine(item)) {
                    if (!isBackstagePass(item)) {
                        reduceQuality(item);
                    } else {
                        qualityZero(item);
                    }
                } else {
                    increaseQuality(item);
                }
            }
        }
    }

    private void updateQuality(Item item) {
        if (!isWine(item)
                && !isBackstagePass(item)) {
            reduceQuality(item);
        } else {
            increaseQuality(item);

            if (isBackstagePass(item)) {
                if (item.sellIn < 11) {
                    increaseQuality(item);
                }

                if (item.sellIn < 6) {
                    increaseQuality(item);
                }
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