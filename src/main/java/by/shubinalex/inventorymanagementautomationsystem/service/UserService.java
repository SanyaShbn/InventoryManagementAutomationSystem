package by.shubinalex.inventorymanagementautomationsystem.service;

import by.shubinalex.inventorymanagementautomationsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
}
