package hu.flowacademy.test.foodorder.Repository;

import hu.flowacademy.test.foodorder.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
}
