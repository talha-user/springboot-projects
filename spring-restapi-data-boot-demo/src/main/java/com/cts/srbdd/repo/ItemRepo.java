package com.cts.srbdd.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.srbdd.entity.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item,Long> {

}
