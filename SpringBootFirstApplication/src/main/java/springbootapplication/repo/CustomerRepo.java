package springbootapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootapplication.domain.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
