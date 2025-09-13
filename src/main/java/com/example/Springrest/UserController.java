package com.example.Springrest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    private List<User> detailUsers =new ArrayList<>();

    public UserController() {
        detailUsers.add(new User(101, "Renuka", "renuka@example.com"));
        detailUsers.add(new User(201, "John", "john@example.com"));
        detailUsers.add(new User(301, "Alice", "alice@example.com"));
    }

    @GetMapping
    public List<User> getUsers() {
        return detailUsers;
    }
    @GetMapping("/{id}")
    public User getUser(@PathVariable int id){
        return detailUsers.stream()
                .filter(u->u.getId()==id)
                .findFirst()
                .orElse(null);
    }
    @PostMapping
    public String createUser(@RequestBody User user){
        detailUsers.add(user);
        return "User created";
    }
    @PostMapping("/batch")
    public ResponseEntity<List<User>>
        addUsers(@RequestBody List<User> newUsers) {
        detailUsers.addAll(newUsers);
        return ResponseEntity.ok(newUsers);
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        boolean removed = detailUsers.removeIf(u -> u.getId() == id);
        return removed ? "User deleted successfully!" : "User not found!";
    }
    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id, @RequestBody User updatedUser) {
        for (User user : detailUsers) {
            if (user.getId() == id) {
                user.setName(updatedUser.getName());
                user.setEmail(updatedUser.getEmail());
                return "User updated successfully!";
            }
        }
        return "User not found!";
    }


    }




