package hu.flowacademy.test.foodorder.Repository;

import hu.flowacademy.test.foodorder.Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

}
