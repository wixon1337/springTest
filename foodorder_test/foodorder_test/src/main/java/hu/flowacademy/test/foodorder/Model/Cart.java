package hu.flowacademy.test.foodorder.Model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Cart {

    @Column
    @Id
    private Long id;

    @ManyToOne
    private User user;

    @Column
    private LocalDateTime orderDate;

    @OrderColumn
    @ManyToMany(cascade = CascadeType.ALL)
    private Food[] foods;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Food[] getFoods() {
        return foods;
    }

    public void setFoods(Food[] foods) {
        this.foods = foods;
    }
}
