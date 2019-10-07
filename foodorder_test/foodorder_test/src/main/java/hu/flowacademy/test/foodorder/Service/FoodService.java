package hu.flowacademy.test.foodorder.Service;

import hu.flowacademy.test.foodorder.Model.Food;
import hu.flowacademy.test.foodorder.Repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    FoodRepository foodRepository;

    public Food findOne(Long id) {
        return this.foodRepository.findById(id).orElse(null);
    }

    public List<Food> findAll() {
        return this.foodRepository.findAll();
    }

    public Food save(Food food) {
        return this.foodRepository.save(food);
    }

    public void delete(Long id) {
        this.foodRepository.deleteById(id);
    }

    public Food update(Food food) {
        if (this.foodRepository.findById(food.getId()).isPresent()) {
            Food repoFood = this.foodRepository.findById(food.getId()).get();
            repoFood.setId(food.getId());
            repoFood.setCarts(food.getCarts());
            repoFood.setName(food.getName());
            repoFood.setParts(food.getParts());
            return repoFood;
        }
        return this.foodRepository.save(food);
    }
}
