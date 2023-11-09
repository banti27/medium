package in.bhartivikas.blogpost.controller;


import in.bhartivikas.blogpost.dto.SignupRequestDto;
import in.bhartivikas.blogpost.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody SignupRequestDto signupRequestDto) {

        this.userService.signup(signupRequestDto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

}
