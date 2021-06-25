package com.gildedtros.domainlogic;

import com.gildedtros.Item;

public abstract class ItemSomething {
    private Item item;

    protected ItemSomething(Item item) {
        this.item = item;
    }

    public abstract void updateQuality();

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

    public Item getItem() {
        return item;
    }

    public void updateSellin() {
        this.item.sellIn = this.item.sellIn - 1;
    }
}
