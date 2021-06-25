package com.gildedtros.domainlogic;

import com.gildedtros.Item;

public class DefaultItemSomething extends ItemSomething {
    protected DefaultItemSomething(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        reduceQuality();
    }
}
