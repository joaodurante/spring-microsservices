package com.joaodurante.hrworker.repository;

import com.joaodurante.hrworker.domain.Worker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
    
}
