package com.fse.microservices.componentprocessing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fse.microservices.componentprocessing.bean.ProcessResponse;

@Repository
public interface ComponentProcessingRepository extends JpaRepository<ProcessResponse,Long > {

}
