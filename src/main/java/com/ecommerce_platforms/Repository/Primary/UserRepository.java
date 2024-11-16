package com.ecommerce_platforms.Repository.Primary;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce_platforms.Model.Primary.User;

public interface UserRepository extends JpaRepository<User,Long>{
    
}
