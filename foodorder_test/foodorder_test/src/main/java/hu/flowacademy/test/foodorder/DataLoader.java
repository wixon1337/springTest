package hu.flowacademy.test.foodorder;

import hu.flowacademy.test.foodorder.Model.Food;
import hu.flowacademy.test.foodorder.Repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private FoodRepository foodRepository;

    @Autowired
    public DataLoader(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public void run(ApplicationArguments args) {
        foodRepository.save(new Food("sajt", "asdasd", null));
        foodRepository.save(new Food("sajt2", "asdasd", null));
        foodRepository.save(new Food("sajt3", "asdasd", null));
        foodRepository.save(new Food("sajt4", "asdasd", null));
        foodRepository.save(new Food("sajt5", "asdasd", null));
    }
}
