package ru.project.exampleRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.project.exampleRest.model.Tea;

@Repository
public interface TeaRepository extends JpaRepository<Tea, Long> {
    Tea findByName(String name);
}
