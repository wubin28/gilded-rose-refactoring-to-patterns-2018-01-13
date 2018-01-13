package org.katas;

public class Sulfuras extends Item {
    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    @Override
    public Item updateSellInAndQuality() {
        return new Sulfuras(this.name, updateSellIn(), updateQuality());
    }

    private int updateQuality() {
        return quality;
    }
}
