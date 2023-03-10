package com.java.service;

import com.java.model.Faculty;

import java.util.Collection;

public interface FacultyService {
    Faculty createFaculty(Faculty faculty);

    Faculty getFacultyById(Long id);

    Faculty updateFaculty(Faculty faculty);

    void deleteFaculty(Long id);

    Collection<Faculty> findByColor(String color);

    Collection<Faculty> findAllFaculties();

    Faculty findFacultyByName(String name);

    String findTheLongestFacultyName();

}
