package com.gildedtros;

public abstract class ItemSomething {
    private Item item;

    protected ItemSomething(Item item) {
        this.item = item;
    }

    public void qualityZero() {
        this.item.quality = 0;
    }

    public void reduceQuality() {
        if (this.item.quality > 0) {
            this.item.quality = this.item.quality - 1;
        }
    }


    public void increaseQuality() {
        if (this.item.quality < 50) {
            this.item.quality = this.item.quality + 1;
        }
    }

    public Item getItem() {
        return item;
    }
}
