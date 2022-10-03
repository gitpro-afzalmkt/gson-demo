package com.gsondemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gsondemo.Entity.Details;

@Repository
public interface DetailsRepository extends JpaRepository<Details, Long>{

}
