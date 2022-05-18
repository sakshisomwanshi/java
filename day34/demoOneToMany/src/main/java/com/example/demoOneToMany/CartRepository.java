package com.example.demoOneToMany;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface CartRepository extends JpaRepositoryImplementation<Cart, Integer> {

}
