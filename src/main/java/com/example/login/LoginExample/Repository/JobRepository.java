package com.example.login.LoginExample.Repository;


import com.example.login.LoginExample.Models.Job;
import org.springframework.data.repository.CrudRepository;


import org.springframework.stereotype.Repository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface JobRepository extends CrudRepository<Job, Long> {

}
