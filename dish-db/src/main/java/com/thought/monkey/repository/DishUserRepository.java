package com.thought.monkey.repository;

import com.thought.monkey.domain.DishUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DishUserRepository extends JpaRepository<DishUser,String>, JpaSpecificationExecutor<DishUser> {
}
