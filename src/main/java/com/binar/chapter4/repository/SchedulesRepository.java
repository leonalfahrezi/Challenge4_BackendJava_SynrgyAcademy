package com.binar.chapter4.repository;

import com.binar.chapter4.model.Schedules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedulesRepository extends JpaRepository<Schedules, Long> {
}