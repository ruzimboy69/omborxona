package uz.pdp.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.warehouse.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
//    boolean findByPhoneNumberAndPassword(String phoneNumber,String password);
}
