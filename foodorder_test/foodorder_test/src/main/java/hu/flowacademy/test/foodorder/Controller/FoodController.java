package hu.flowacademy.test.foodorder.Controller;

import hu.flowacademy.test.foodorder.Model.Food;
import hu.flowacademy.test.foodorder.Service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FoodController {

    @Autowired
    FoodService foodService;

    @GetMapping("/food/{id}")
    public Food findOne(@PathVariable Long id) {
        return this.foodService.findOne(id);
    }

    @GetMapping("/foods")
    public List<Food> findAll() {
        return this.foodService.findAll();
    }

    @PostMapping("/food")
    public Food saveFood(@RequestBody Food food) {
        return this.foodService.save(food);
    }

    @PutMapping("/food")
    public Food updateFood(@RequestBody Food food) {
        return this.foodService.update(food);
    }
    @DeleteMapping("/food/{id}")
    public void deleteFood(@PathVariable Long id) {
        this.foodService.delete(id);
    }
}
