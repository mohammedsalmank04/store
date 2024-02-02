package com.learnSpringBoot.store.dao;

import com.learnSpringBoot.store.entity.Shipper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipperRepository extends JpaRepository<Shipper,Integer> {
}
