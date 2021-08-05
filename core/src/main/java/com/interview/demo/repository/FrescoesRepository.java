package com.interview.demo.repository;

import com.interview.demo.entity.FrescoesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FrescoesRepository extends JpaRepository<FrescoesEntity, Long> {
}
