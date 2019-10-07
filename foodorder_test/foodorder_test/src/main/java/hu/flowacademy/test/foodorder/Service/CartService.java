package hu.flowacademy.test.foodorder.Service;

import hu.flowacademy.test.foodorder.Exception.ValidationException;
import hu.flowacademy.test.foodorder.Model.Cart;
import hu.flowacademy.test.foodorder.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    public Cart findOne(Long id) {
        return this.cartRepository.findById(id).orElse(null);
    }

    public List<Cart> findAll() {
        return this.cartRepository.findAll();
    }

    public Cart save(Cart cart) {
        if (cart.getUser() == null || cart.getFoods() == null) {
            throw new ValidationException("Must have user and food!");
        } else {
            cart.setOrderDate(LocalDateTime.now());
            return this.cartRepository.save(cart);
        }
    }

    public void delete(Long id) {
        this.cartRepository.deleteById(id);
    }
}
