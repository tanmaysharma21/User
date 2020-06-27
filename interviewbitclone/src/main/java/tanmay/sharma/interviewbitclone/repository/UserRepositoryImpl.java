package tanmay.sharma.interviewbitclone.repository;

import org.springframework.stereotype.Repository;
import tanmay.sharma.interviewbitclone.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgress")
public class UserRepositoryImpl implements UserRepository {

    private List<User> userDatabase = new ArrayList<>();

    @Override
    public User createUser(User user) {
        User createdUser = new User(user.getName(), user.getGender());
        userDatabase.add(createdUser);
        return createdUser;
    }

    @Override
    public List<User> getAllUser() {
        return userDatabase;
    }

    @Override
    public Optional<User> getUser(UUID id) {
        return userDatabase
                .stream()
                .filter(
                        user -> user.getUuid().equals(id)
                ).findFirst();
    }
}
