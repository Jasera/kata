package com.gildedtros.domainlogic;

import com.gildedtros.Item;
import com.gildedtros.domainlogic.ItemSomething;

public class WineItemSomething extends ItemSomething {
    public WineItemSomething(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        increaseQuality();
    }

    @Override
    protected void negativeSellin() {

    }

}
