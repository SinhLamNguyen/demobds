package vn.vti.bds.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.vti.bds.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
    User findByUsername(String username);
}
