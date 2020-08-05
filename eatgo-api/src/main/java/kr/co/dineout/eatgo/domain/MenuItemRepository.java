package kr.co.dineout.eatgo.domain;

import java.util.List;

public interface MenuItemRepository {
    List<MenuItem> findAllRestaurantId(Long restaurantId);

}