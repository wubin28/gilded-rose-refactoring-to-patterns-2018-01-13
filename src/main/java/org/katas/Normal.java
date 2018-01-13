package org.katas;

public class Normal extends Item {
    Normal(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public Item updateSellInAndQuality() {
        return new Normal(super.name, updateSellIn(), notLessThanZero((sellIn <= 0) ? quality - 2 : quality - 1));
    }

    private int updateSellIn() {
        return sellIn - 1;
    }
}
