package com.htc.restaurant.presistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.restaurant.entity.Restaurant;

@Repository
public interface IRestaurant extends JpaRepository<Restaurant, Long>  {

}
