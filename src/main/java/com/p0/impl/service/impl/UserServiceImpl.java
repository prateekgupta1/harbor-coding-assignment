package com.p0.impl.service.impl;

import com.p0.api.dto.request.UserRequestDTO;
import com.p0.api.dto.response.UserResponseDTO;
import com.p0.impl.entities.User;
import com.p0.impl.repository.UserRepository;
import com.p0.impl.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;
    @Override
    public UserResponseDTO createUser(UserRequestDTO userRequestDTO) {
        User user = User.builder().name(userRequestDTO.getName())
                        .email(userRequestDTO.getEmail())
                                .build();
        user = userRepository.save(user);
        return new UserResponseDTO(user.getId(), user.getName(), user.getEmail());
    }
}
