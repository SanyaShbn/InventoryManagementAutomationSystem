package by.shubinalex.inventorymanagementautomationsystem.controller;

import by.shubinalex.inventorymanagementautomationsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
}
