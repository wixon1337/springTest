package hu.flowacademy.test.foodorder.Repository;

import hu.flowacademy.test.foodorder.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
