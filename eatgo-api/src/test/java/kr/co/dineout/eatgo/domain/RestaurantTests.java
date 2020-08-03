package kr.co.dineout.eatgo.domain;

import org.junit.Test;

import java.net.DatagramPacket;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RestaurantTests {

    @Test
    public void creation(){
        Restaurant restaurant= new Restaurant(1004L,"Bob zip","seoul");
        assertThat(restaurant.getId(),is(1004L));
        assertThat(restaurant.getName(),is("Bob zip"));
        assertThat(restaurant.getAddress(),is("seoul"));
    }

    @Test
    public void infomation(){
        Restaurant restaurnat=new Restaurant(1004L,"Bob zip","seoul");
        assertThat(restaurnat.getInfomation(),is("Bob zip in seoul"));
    }
}