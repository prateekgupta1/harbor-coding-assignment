package com.p0.api.dto.response;

import lombok.Data;

@Data
public class UserResponseDTO {

    private final Long id;

    private final String email;

    private final String name;
}
