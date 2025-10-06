package com.example.taskmanager.service;

import com.example.taskmanager.entity.Project;
import com.example.taskmanager.entity.User;
import com.example.taskmanager.repository.ProjectRepository;
import com.example.taskmanager.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;
    private final UserRepository userRepository;

    public ProjectService(ProjectRepository projectRepository, UserRepository userRepository) {
        this.projectRepository = projectRepository;
        this.userRepository = userRepository;
    }

    public Project createProject(Long userId, Project project) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            project.setUser(user.get());
            return projectRepository.save(project);
        } else {
            throw new RuntimeException("User not found");
        }
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }
}
