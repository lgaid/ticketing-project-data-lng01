package com.cydeo.service;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.dto.TaskDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.entity.Task;
import com.cydeo.enums.Status;
import com.cydeo.repository.TaskRepository;

import javax.validation.constraints.Min;
import java.util.List;

public interface TaskService  {


    List<TaskDTO> listAllTasks();
    void save(TaskDTO dto);
    void update(TaskDTO dto);
    void delete(Long id);
    TaskDTO findById(Long id);
    int totalCompletedTask(String projectCode);
    int totalNonCompletedTask(String projectCode);

    void deleteByProject(ProjectDTO projectDTO);
    void completeByProject(ProjectDTO projectDTO);

    List<TaskDTO> listAllTasksByStatusIsNot(Status status);
    List<TaskDTO> listAllTasksByStatus(Status status);

    List<TaskDTO> listAllNonCompletedByAssignedEmployee(UserDTO assignedEmployee);



}
