package hu.flowacademy.test.foodorder;

import hu.flowacademy.test.foodorder.Exception.ValidationException;
import hu.flowacademy.test.foodorder.Model.Food;
import hu.flowacademy.test.foodorder.Model.User;
import hu.flowacademy.test.foodorder.Service.UserService;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    UserService userService;

    @Test
    public void userMustHaveUsername() {
        User user = new User("","","");
       //  assertThrows(ValidationException.class, userService.save(user));
    }
}
