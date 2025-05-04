package com.satyam.SpringBoot.repo;

import com.satyam.SpringBoot.dao.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends JpaRepository<TestEntity, Long> {

}