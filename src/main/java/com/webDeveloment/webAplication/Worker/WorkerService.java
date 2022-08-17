package com.webDeveloment.webAplication.Worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {

    private final WorkerRepository workerRepository;

    @Autowired
    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    public List<Worker> getWorker(){

        return workerRepository.findAll();

    }

    public void addNewWorker(Worker worker) {
        Optional<Worker> workerOptional = workerRepository.findWorkerByEmail(worker.getEmail());
        if(workerOptional.isPresent()){
            throw new IllegalStateException("Email Taken");
        }
        workerRepository.save(worker);
    }

    public void deleteWorker(Long workerId) {
        boolean exists = workerRepository.existsById(workerId);
            if(!exists){
                throw new IllegalStateException("Theres no worker with id: " + workerId);
            }
        workerRepository.deleteById(workerId);

    }
}
