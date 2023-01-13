package com.java.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.java.model.Avatar;

import java.util.Optional;

public interface AvatarRepository extends PagingAndSortingRepository<Avatar, Long> {
    Optional<Avatar> findByStudentId(Long studentId);
}
