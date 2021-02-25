package com.thought.monkey.repository;

import com.thought.monkey.domain.DishAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


/**
 * @program: smartdish
 * @description:
 * @author: ywd
 * @contact:1371690483@qq.com
 * @create: 2021-02-25 14:03
 **/
@Repository
public interface DishAdminRepository extends JpaRepository<DishAdmin,String> , JpaSpecificationExecutor<DishAdmin> {

}
