package org.project.ljm_project_outflearn.common;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class HelloService {
    private final UserDAO userDAO;

    public String getUsers() {
        List<UserDTO> users = userDAO.getUsers();
        return users.toString();
    }
}
