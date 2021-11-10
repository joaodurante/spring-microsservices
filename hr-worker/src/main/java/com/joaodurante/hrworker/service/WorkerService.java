package com.joaodurante.hrworker.service;

import java.util.List;

import com.joaodurante.hrworker.domain.Worker;
import com.joaodurante.hrworker.repository.WorkerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {
    @Autowired
    WorkerRepository workerRepository;
    
    public List<Worker> findAll() {
        return workerRepository.findAll();
    }

    public Worker findById(Long id) {
        return workerRepository.findById(id).get();
    }
}
