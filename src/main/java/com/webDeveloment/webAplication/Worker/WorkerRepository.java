package com.webDeveloment.webAplication.Worker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

    @Query("SELECT s FROM Worker s WHERE s.email = ?1")
    Optional<Worker> findWorkerByEmail(String Email);
}
