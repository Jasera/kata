package com.gildedtros.domainlogic;

import com.gildedtros.Item;
import com.gildedtros.domainlogic.ItemSomething;

public class LegendaryItemSomething extends ItemSomething {
    public LegendaryItemSomething(Item item) {
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
