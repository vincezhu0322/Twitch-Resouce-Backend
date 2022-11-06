package com.laioffer.demo.entity.request;
import com.laioffer.demo.entity.db.Item;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FavoriteRequestBody {
    @JsonProperty("favorite")
    private Item favoriteItem;

    public Item getFavoriteItem() {
        return favoriteItem;
    }
}
