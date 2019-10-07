package hu.flowacademy.test.foodorder.Service;

import hu.flowacademy.test.foodorder.Model.Cart;
import hu.flowacademy.test.foodorder.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return this.cartRepository.save(cart);
    }

    public void delete(Long id) {
        this.cartRepository.deleteById(id);
    }
}
