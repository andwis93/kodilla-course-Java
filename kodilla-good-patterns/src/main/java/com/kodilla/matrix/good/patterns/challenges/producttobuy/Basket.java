package com.kodilla.matrix.good.patterns.challenges.producttobuy;


import com.kodilla.matrix.good.patterns.challenges.Item;

import java.util.ArrayList;
import java.util.List;

public class Basket implements ProductToBuy {

    private List<Item> itemList = new ArrayList<>();

    public Basket(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public List<Item> getItemList() {
        return itemList;
    }

    public void addItemToList(Item item){
        itemList.add(item);
    }
}
