package com.iesam.digitallibrary.feature.user.domain;

public class CreateUserUseCase {
    private UserRepository userRepository;

    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute (User user){
        userRepository.createUser(user);

    }
}
