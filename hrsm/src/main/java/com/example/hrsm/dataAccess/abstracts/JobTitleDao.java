package com.example.hrsm.dataAccess.abstracts;

import com.example.hrsm.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {

}
