package com.gildedrose.factory;

import com.gildedrose.model.Item;
import com.gildedrose.service.ItemUpdater;
import com.gildedrose.service.impl.AgedBrieUpdaterImpl;
import com.gildedrose.service.impl.BackstagePassUpdaterImpl;
import com.gildedrose.service.impl.ConjuredItemUpdaterImpl;
import com.gildedrose.service.impl.SulfurasUpdaterImpl;
import com.gildedrose.service.impl.NormalItemUpdaterImpl;

public class ItemUpdaterFactory {

    public static ItemUpdater getUpdater(Item item) {
        String name = item.name;

        if (name.equals("Aged Brie")) {
            return new AgedBrieUpdaterImpl();
        }
        if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new BackstagePassUpdaterImpl();
        }
        if (name.equals("Sulfuras, Hand of Ragnaros")) {
            return new SulfurasUpdaterImpl();
        }
        if (name.startsWith("Conjured")) {
            return new ConjuredItemUpdaterImpl();
        }

        return new NormalItemUpdaterImpl();
    }
}
