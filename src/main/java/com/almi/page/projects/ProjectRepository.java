package com.almi.page.projects;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Almi on 7/16/2017.
 */
@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Query("select p from Project p where p.projectName = :name")
    Project findByName(@Param("name") String name);

}
