package com.gildedrose.service.impl;

import com.gildedrose.model.Item;
import com.gildedrose.util.QualityHelper;
import com.gildedrose.service.ItemUpdater;;

public class ConjuredItemUpdaterImpl implements ItemUpdater {

    @Override
    public void update(Item item) {
        QualityHelper.decreaseQuality(item, 2);
        item.sellIn--;

        if (item.sellIn < 0) {
            QualityHelper.decreaseQuality(item, 2);
        }
    }
}
