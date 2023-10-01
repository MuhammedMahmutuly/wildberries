package com.kz.orders.repositoryes;

import com.kz.orders.entityes.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface OrderRepository extends JpaRepository<Order, UUID> {
    @Query("from Order where number = :number")
    public Order findByNumber(@Param("number") String number);
}
