package com.htc.booking.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.booking.entity.Booking;


@Repository
public interface IBooking  extends JpaRepository<Booking,Long>{

}
