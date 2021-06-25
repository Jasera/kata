package com.gildedtros.domainlogic;

import com.gildedtros.Item;

public class ConferenceItemHandler extends ItemHandler {
    public ConferenceItemHandler(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        increaseQuality();

        if (getItem().sellIn < 11) {
            increaseQuality();
        }

        if (getItem().sellIn < 6) {
            increaseQuality();
        }
    }

    @Override
    protected void negativeSellin() {
        this.qualityZero();
    }
}
