package com.springbootassignment.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootassignment.entity.JsonModel;

@Repository
public interface JsonModelRepository extends JpaRepository<JsonModel, Long> {
}
