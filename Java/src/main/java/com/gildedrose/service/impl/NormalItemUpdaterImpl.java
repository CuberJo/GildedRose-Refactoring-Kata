package com.gildedrose.service.impl;

import com.gildedrose.model.Item;
import com.gildedrose.service.ItemUpdater;
import com.gildedrose.util.QualityHelper;

public class NormalItemUpdaterImpl implements ItemUpdater {

    @Override
    public void update(Item item) {
        QualityHelper.decreaseQuality(item, 1);
        item.sellIn--;

        if (item.sellIn < 0) {
            QualityHelper.decreaseQuality(item, 1);
        }
    }
}
