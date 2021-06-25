package com.gildedtros.domainlogic;

import com.gildedtros.Item;

public abstract class ItemHandler {
    private Item item;

    protected ItemHandler(Item item) {
        this.item = item;
    }

    public void updateSellin() {
        this.item.sellIn = this.item.sellIn - 1;
    }

    public void handleNegativeSellin() {
        if (this.item.sellIn < 0) {
            negativeSellin();
        }
    }

    public Item getItem() {
        return item;
    }

    public abstract void updateQuality();

    protected abstract void negativeSellin();

    protected void qualityZero() {
        this.item.quality = 0;
    }

    protected void reduceQuality() {
        if (this.item.quality > 0) {
            this.item.quality = this.item.quality - 1;
        }
    }

    protected void increaseQuality() {
        if (this.item.quality < 50) {
            this.item.quality = this.item.quality + 1;
        }
    }

}
