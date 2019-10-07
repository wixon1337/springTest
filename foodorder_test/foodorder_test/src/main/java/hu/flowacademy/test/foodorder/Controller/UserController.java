package hu.flowacademy.test.foodorder.Controller;

import hu.flowacademy.test.foodorder.Model.User;
import hu.flowacademy.test.foodorder.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public User findOne(@PathVariable String id) {
        return this.userService.findOne(id);
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return this.userService.findAll();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return this.userService.save(user);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return this.userService.update(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable String id) {
        this.userService.delete(id);
    }
}
