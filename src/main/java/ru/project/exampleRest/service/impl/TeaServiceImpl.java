package ru.project.exampleRest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.exampleRest.model.Tea;
import ru.project.exampleRest.repository.TeaRepository;
import ru.project.exampleRest.service.TeaService;

import java.util.List;

@Service
public class TeaServiceImpl implements TeaService {


    private TeaRepository teaRepository;

    @Autowired
    public TeaServiceImpl(TeaRepository teaRepository) {
        this.teaRepository = teaRepository;
    }

    @Override
    public Tea addTea(Tea tea) {
        Tea savedTea = teaRepository.saveAndFlush(tea);
        return savedTea;
    }

    @Override
    public void delete(long id) {
        teaRepository.deleteById(id);
    }

    @Override
    public Tea getByName(String name) {
        return teaRepository.findByName(name);
    }

    @Override
    public Tea editTea(Tea tea) {
        return null;
    }

    @Override
    public List<Tea> getAll() {
        return teaRepository.findAll();
    }
}
