package com.gildedtros.domainlogic;

import com.gildedtros.Item;

public class DefaultItemHandler extends ItemHandler {
    protected DefaultItemHandler(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        reduceQuality();
    }

    @Override
    protected void negativeSellin() {
        reduceQuality();
    }
}
