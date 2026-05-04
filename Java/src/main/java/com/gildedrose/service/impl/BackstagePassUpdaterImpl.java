package com.gildedrose.service.impl;

import com.gildedrose.model.Item;
import com.gildedrose.service.ItemUpdater;
import com.gildedrose.util.QualityHelper;

public class BackstagePassUpdaterImpl implements ItemUpdater {

    @Override
    public void update(Item item) {
        if (item.sellIn <= 0) {
            item.quality = 0;
        } else if (item.sellIn <= 5) {
            QualityHelper.increaseQuality(item, 3);
        } else if (item.sellIn <= 10) {
            QualityHelper.increaseQuality(item, 2);
        } else {
            QualityHelper.increaseQuality(item, 1);
        }

        item.sellIn--;
    }
}
