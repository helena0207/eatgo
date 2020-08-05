package kr.co.dineout.eatgo.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {

    List<Restaurant> restaurants=new ArrayList<>();
    private RestaurantRepositoryImpl(){
        restaurants.add(new Restaurant(1004L,"Bob zip", "seoul"));
        restaurants.add(new Restaurant(2020L,"Cyber Food", "seoul"));
    }
    @Override
    public List<Restaurant> findAll(){
        return restaurants;
    }
    @Override
    public Restaurant findById(Long id){
                return restaurants.stream()
                .filter(r->r.getId().equals(id))
                .findFirst()
                .get();

    }

}
