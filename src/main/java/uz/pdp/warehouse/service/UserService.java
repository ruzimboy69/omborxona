package uz.pdp.warehouse.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.warehouse.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

}
