package com.gildedtros.domainlogic;

import com.gildedtros.Item;

public class SmellyItemHandler extends ItemHandler {
    public SmellyItemHandler(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        reduceQuality();
        reduceQuality();
    }

    @Override
    protected void negativeSellin() {
        reduceQuality();
        reduceQuality();
    }
}
