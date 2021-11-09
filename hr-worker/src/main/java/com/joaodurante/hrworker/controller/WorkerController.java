package com.joaodurante.hrworker.controller;

import java.util.List;

import com.joaodurante.hrworker.domain.Worker;
import com.joaodurante.hrworker.service.WorkerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/worker")
public class WorkerController {
    @Autowired
    WorkerService workerService;
    
    @GetMapping(value = "")
    public List<Worker> findAll() {
        return workerService.findAll();
    }
}
