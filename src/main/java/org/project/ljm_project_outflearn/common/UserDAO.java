package org.project.ljm_project_outflearn.common;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDAO {
    List<UserDTO> getUsers();
}

