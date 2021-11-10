package com.joaodurante.hrworker.controller;

import java.util.List;

import com.joaodurante.hrworker.domain.Worker;
import com.joaodurante.hrworker.service.WorkerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/worker")
public class WorkerController {
    @Autowired
    WorkerService workerService;
    
    @GetMapping(value = "")
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> workers = workerService.findAll();
        return ResponseEntity.ok(workers);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@RequestParam Long id) {
        Worker worker = workerService.findById(id);
        return ResponseEntity.ok(worker);
    }
}
