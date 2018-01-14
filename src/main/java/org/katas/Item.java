package org.katas;

public abstract class Item {
    public static final String SULFURAS = "Sulfuras";
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES = "Backstage passes";
    public static final String NORMAL = "Normal";
    public static final int MAX_QUALITY = 50;
    public static final int MIN_QUALITY = 0;
    final int sellIn;
    final int quality;
    final String name;

    public static Item newInstanceWithNameSellInAndQuality(String name, int sellIn, int quality) {
        if (!name.equals(SULFURAS) && (quality > MAX_QUALITY || quality < MIN_QUALITY)) {
            throw new IllegalArgumentException("The quality of the normal item should be between 0 and 50.");
        }
        if (name.equals(SULFURAS)) {
            return new Sulfuras(name, sellIn, quality);
        }
        if (name.equals(AGED_BRIE)) {
            return new AgedBrie(name, sellIn, quality);
        }
        if (name.equals(BACKSTAGE_PASSES)) {
            return new BackstagePasses(name, sellIn, quality);
        }
        return new Normal(name, sellIn, quality);
    }

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int getSellIn() {
        return this.sellIn;
    }

    public Item updateSellInAndQuality() {
        return newInstanceWithNameSellInAndQuality(name, updateSellIn(), updateQuality());
    }

    int notGreaterThanFifty(int quality) {
        return quality > MAX_QUALITY ? MAX_QUALITY : quality;
    }

    int notLessThanZero(int quality) {
        return quality <= 0 ? 0 : quality;
    }

    public int getQuality() {
        return this.quality;
    }

    protected int updateSellIn() {
        return sellIn - 1;
    }

    protected abstract int updateQuality();
}
