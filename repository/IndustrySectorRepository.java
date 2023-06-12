package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.entity.IndustrySector;


@Repository
public interface IndustrySectorRepository extends JpaRepository<IndustrySector,Long> {

}
