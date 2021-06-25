package com.gildedtros.domainlogic;

import com.gildedtros.Item;
import com.gildedtros.domainlogic.handler.*;

public class ItemSomethingFactory {

    public static ItemHandler createItemSomething(Item item) {
        switch (item.name) {
            case "Backstage passes for Re:Factor":
            case "Backstage passes for HAXX":
                return new ConferenceItemHandler(item);
            case "B-DAWG Keychain":
                return new LegendaryItemHandler(item);
            case "Good Wine":
                return new WineItemHandler(item);
            case "Duplicate Code":
            case "Long Methods":
            case "Ugly Variable Names":
                return new SmellyItemHandler(item);
            default:
                return new DefaultItemHandler(item);
        }
    }
}
