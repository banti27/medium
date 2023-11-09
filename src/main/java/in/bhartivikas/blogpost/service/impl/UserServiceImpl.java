package in.bhartivikas.blogpost.service.impl;

import in.bhartivikas.blogpost.dto.SignupRequestDto;
import in.bhartivikas.blogpost.dto.SignupResponseDto;
import in.bhartivikas.blogpost.entity.User;
import in.bhartivikas.blogpost.repository.UserRepository;
import in.bhartivikas.blogpost.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public SignupResponseDto signup(SignupRequestDto signupRequestDto) {
        final var user = new User();
        user.setUsername(signupRequestDto.getUsername());
        user.setPassword(signupRequestDto.getPassword());

        this.userRepository.save(user);

        final var signupResponse = new SignupResponseDto();
        return signupResponse;
    }
}
