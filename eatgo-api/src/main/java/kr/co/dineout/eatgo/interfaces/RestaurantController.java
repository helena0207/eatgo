package kr.co.dineout.eatgo.interfaces;

import kr.co.dineout.eatgo.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantRepositoryImpl restaurantRepository;

    @Autowired
    private MenuItemRepositoryImpl menuItemRepository;

    @GetMapping("/restaurants")
    public List<Restaurant> list(){
        List<Restaurant> restaurants= restaurantRepository.findAll();
        return restaurants;
    }
    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id){
        Restaurant restaurant= restaurantRepository.findById(id);

        List<MenuItem> menuItems = menuItemRepository.findAllRestaurantId(id);
        restaurant.setMenuItems(menuItems);

        return restaurant;
    }
}
