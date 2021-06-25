package com.gildedtros.domainlogic.handler;

import com.gildedtros.Item;

public class DefaultItemHandler extends ItemHandler {
    public DefaultItemHandler(Item item) {
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
