package by.shubinalex.inventorymanagementautomationsystem.service;

import by.shubinalex.inventorymanagementautomationsystem.entity.User;
import by.shubinalex.inventorymanagementautomationsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService  {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userLogin) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUserLogin(userLogin);

        org.springframework.security.core.userdetails.User.UserBuilder builder = null;
        if (user.isPresent()) {
            User currentUser = user.get();
            builder = org.springframework.security.core.userdetails.User.withUsername(userLogin);
            builder.password(currentUser.getUserPassword());
            builder.roles(String.valueOf(currentUser.getRole()));
        } else {
            throw new UsernameNotFoundException("User not found.");
        }

        return builder.build();
    }
}
