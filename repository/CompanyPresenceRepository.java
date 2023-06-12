package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.entity.CompanyPresence;


@Repository
public interface CompanyPresenceRepository extends JpaRepository<CompanyPresence, Long> {

}
