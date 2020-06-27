package tanmay.sharma.interviewbitclone.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tanmay.sharma.interviewbitclone.models.User;
import tanmay.sharma.interviewbitclone.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public  UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        var user1 = userRepository.createUser(user);
        return  user1;
    }

    public List<User> getAllUser() {
        return userRepository.getAllUser();
    }

    public User getUser(UUID id) {
        var user = userRepository.getUser(id);
        return  user.isEmpty() ? null : user.get();
    }
}
