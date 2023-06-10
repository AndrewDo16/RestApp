package ru.project.exampleRest.service;

import org.springframework.stereotype.Service;
import ru.project.exampleRest.model.Tea;

import java.util.List;

@Service
public interface TeaService {

    Tea addTea(Tea tea);
    void delete(long id);
    Tea getByName(String name);
    Tea editTea(Tea tea);
    List<Tea> getAll();

}
