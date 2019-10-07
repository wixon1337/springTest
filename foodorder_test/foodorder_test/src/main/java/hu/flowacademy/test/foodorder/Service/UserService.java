package hu.flowacademy.test.foodorder.Service;

import hu.flowacademy.test.foodorder.Model.User;
import hu.flowacademy.test.foodorder.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User findOne(String id) {
        return this.userRepository.findById(id).orElse(null);
    }

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    public User save(User user) {
        return this.userRepository.save(user);
    }

    public void delete(String id) {
        this.userRepository.deleteById(id);
    }

    public User update(User user) {
            if (this.userRepository.findById(user.getUsername()).isPresent()) {
                User repoUser = this.userRepository.findById(user.getUsername()).get();
                repoUser.setAddress(user.getAddress());
                repoUser.setFullname(user.getFullname());
                return repoUser;
            }
            return this.userRepository.save(user);
    }
}
