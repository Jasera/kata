package com.gildedtros.domainlogic;

import com.gildedtros.Item;

public class ItemSomethingFactory {

    public static ItemSomething createItemSomething(Item item) {
        switch (item.name) {
            case "Backstage passes for Re:Factor":
            case "Backstage passes for HAXX":
                return new ConferenceItemSomething(item);
            case "B-DAWG Keychain":
                return new LegendaryItemSomething(item);
            case "Good Wine":
                return new WineItemSomething(item);
            case "Duplicate Code":
            case "Long Methods":
            case "Ugly Variable Names":
                return new SmellyItemSomething(item);
            default:
                return new DefaultItemSomething(item);
        }
    }
}
