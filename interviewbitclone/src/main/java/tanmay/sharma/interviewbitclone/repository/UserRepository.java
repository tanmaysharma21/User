package tanmay.sharma.interviewbitclone.repository;

import tanmay.sharma.interviewbitclone.models.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository {
    User createUser(User user);

    List<User> getAllUser();

    Optional<User> getUser(UUID id);
}
