package com.example.taskmanager.controller;

import com.example.taskmanager.entity.Project;
import com.example.taskmanager.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService projectService;
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/{userId}")
    public Project createProject(@PathVariable Long userId, @RequestBody Project project) {
        return projectService.createProject(userId, project);
    }

    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }
}
