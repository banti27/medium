package in.bhartivikas.blogpost.service;

import in.bhartivikas.blogpost.dto.SignupRequestDto;
import in.bhartivikas.blogpost.dto.SignupResponseDto;

public interface UserService {

    SignupResponseDto signup(SignupRequestDto signupRequestDto);

}
