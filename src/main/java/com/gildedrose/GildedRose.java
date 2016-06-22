package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert") && !items[i].name.equals("Sulfuras New")) {
                if (items[i].quality > 0 ) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50 && !items[i].name.equals("Sulfuras New")) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            
            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    	//System.out.println("break1");
                        if (items[i].quality > 0 ) {
                        	//System.out.println("break2");
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                            	//System.out.println("break3");
                                items[i].quality = items[i].quality - 1;
                            }
                        }/*else if(items[i].name.equals("Sulfuras New") && items[i].quality>10){
                        	//System.out.println("break4");
                        	 items[i].quality = items[i].quality - 1;
                        }*/
                    } else {
                    	//System.out.println("break5");
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
            
            if ( items[i].name.equals("Sulfuras New") && items[i].sellIn > 0){
            	if(items[i].quality>10){
            		System.out.println("inside");
               	 items[i].quality = items[i].quality - 1;
            	}
            	
            }
        }
    }
}
