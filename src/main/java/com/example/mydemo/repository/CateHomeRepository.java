package com.example.mydemo.repository;

import com.example.mydemo.model.CategoryHome;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CateHomeRepository extends JpaRepository<CategoryHome, Long> {
}
