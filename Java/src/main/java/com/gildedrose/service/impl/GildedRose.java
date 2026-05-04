package com.gildedrose.service.impl;

import com.gildedrose.factory.ItemUpdaterFactory;
import com.gildedrose.model.Item;
import com.gildedrose.service.ItemUpdater;

public class GildedRose {
    public Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemUpdater updater = ItemUpdaterFactory.getUpdater(item);
            updater.update(item);
        }
    }
}
