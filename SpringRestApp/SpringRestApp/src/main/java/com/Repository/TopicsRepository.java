package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Topics;

public interface TopicsRepository extends JpaRepository<Topics, Integer> {

}
