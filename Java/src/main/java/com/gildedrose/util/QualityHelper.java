package com.gildedrose.util;

import com.gildedrose.model.Item;

public class QualityHelper {
    public static void decreaseQuality(Item item, int amount) {
        item.quality = Math.max(0, item.quality - amount);
    }

    public static void increaseQuality(Item item, int amount) {
        item.quality = Math.min(50, item.quality + amount);
    }
}
