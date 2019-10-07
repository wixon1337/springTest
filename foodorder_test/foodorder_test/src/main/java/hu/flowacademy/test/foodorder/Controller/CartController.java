package hu.flowacademy.test.foodorder.Controller;

import hu.flowacademy.test.foodorder.Model.Cart;
import hu.flowacademy.test.foodorder.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping("/cart/{id}")
    public Cart findOne(@PathVariable Long id) {
        return this.cartService.findOne(id);
    }

    @GetMapping("/carts")
    public List<Cart> findAll() {
        return this.cartService.findAll();
    }

    @PostMapping("/cart")
    public Cart saveCart(@RequestBody Cart cart) {
        return this.cartService.save(cart);
    }

    @DeleteMapping("/cart/{id}")
    public void deleteCart(@PathVariable Long id) {
        this.cartService.delete(id);
    }
}
