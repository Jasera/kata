package com.gildedtros.domainlogic;

import com.gildedtros.Item;

public class WineItemHandler extends ItemHandler {
    public WineItemHandler(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        increaseQuality();
    }

    @Override
    protected void negativeSellin() {
        increaseQuality();
    }

}
