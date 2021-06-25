package com.gildedtros.domainlogic.handler;

import com.gildedtros.Item;

public class LegendaryItemHandler extends ItemHandler {
    public LegendaryItemHandler(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        return;
    }

    public void updateSellin() {
        return;
    }

    @Override
    protected void negativeSellin() {
        return;
    }
}
