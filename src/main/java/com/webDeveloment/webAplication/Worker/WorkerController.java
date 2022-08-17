package com.webDeveloment.webAplication.Worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/worker")
public class WorkerController {

    private final WorkerService workerService;

    @Autowired
    public WorkerController(WorkerService workerService){
        this.workerService = workerService;
    }

    @GetMapping
    public List<Worker> getWorker() {
        return workerService.getWorker();
    }

    @PostMapping
    public void registerNewWorker(@RequestBody Worker worker){
        workerService.addNewWorker(worker);

    }
    @DeleteMapping(path = "{workerId}")
    public void deleteWorker(@PathVariable("workerId") Long workerId){
        workerService.deleteWorker(workerId);

    }

}
