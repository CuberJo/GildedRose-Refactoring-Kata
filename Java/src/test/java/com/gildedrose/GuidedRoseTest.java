package com.gildedrose;

import org.junit.jupiter.api.Test;

import com.gildedrose.model.Item;
import com.gildedrose.service.impl.GildedRose;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("fixme", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

}