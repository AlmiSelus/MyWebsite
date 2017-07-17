package com.almi.page.projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Almi on 7/16/2017.
 */
@RestController
public class ProjectRestController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/api/project")
    public List<Project> findAllProjects() {
        return projectService.findAll();
    }

    @PostMapping
    public void addProject(@RequestBody ProjectRequest projectRequest) {
        projectService.addProject(projectRequest);
    }

}
