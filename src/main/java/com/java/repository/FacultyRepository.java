package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.java.model.Faculty;

import java.util.Collection;


public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Collection<Faculty> findByColor(String color);

    Faculty findByNameIgnoreCase(String name);
}
