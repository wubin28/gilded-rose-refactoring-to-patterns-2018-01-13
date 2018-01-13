package org.katas;

public class AgedBrie extends Item {
    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public Item updateSellInAndQuality() {
        return new AgedBrie(this.name, sellIn - 1, notGreaterThanFifty(quality + 1));
    }
}
