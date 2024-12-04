package korotkovs.kinds.veb_chat.repositories;

import korotkovs.kinds.veb_chat.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
