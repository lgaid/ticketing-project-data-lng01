package com.cydeo.mapper;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.entity.Project;
import org.modelmapper.ModelMapper;

public class ProjectMapper {

    private final ModelMapper modelMapper;


    public ProjectMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ProjectDTO convertToDto(Project enitity){

        return modelMapper.map(enitity,ProjectDTO.class);
    }




}
