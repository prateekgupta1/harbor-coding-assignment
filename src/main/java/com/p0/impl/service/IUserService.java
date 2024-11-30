package com.p0.impl.service;

import com.p0.api.dto.request.UserRequestDTO;
import com.p0.api.dto.response.UserResponseDTO;

public interface IUserService {

    public UserResponseDTO createUser(UserRequestDTO userRequestDTO);
}
