package com.project.triple.repository;

import com.project.triple.model.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {
//    List<Review> findByUserId(Long userId);
//
//    Review findByIdx(Long idx);
}
