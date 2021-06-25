package com.gildedtros.domainlogic;

import com.gildedtros.Item;

public class SmellyItemSomething extends ItemSomething {
    public SmellyItemSomething(Item item) {
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
