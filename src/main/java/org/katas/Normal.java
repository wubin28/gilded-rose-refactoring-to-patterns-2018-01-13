package org.katas;

public class Normal extends Item {
    Normal(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected int updateQuality() {
        return notLessThanZero((sellIn <= 0) ? quality - 2 : quality - 1);
    }
}
