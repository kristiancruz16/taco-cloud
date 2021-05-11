package com.springframework.tacocloud.domains.order;


import com.springframework.tacocloud.security.user.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface OrderRepository extends CrudRepository<Order,Long> {
    List<Order> findByZip(String Zip);

    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}
