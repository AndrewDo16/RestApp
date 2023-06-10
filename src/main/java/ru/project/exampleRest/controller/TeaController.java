package ru.project.exampleRest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.project.exampleRest.model.Tea;
import ru.project.exampleRest.service.impl.TeaServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/")
public class TeaController {

    private TeaServiceImpl teaService;

    public TeaController(TeaServiceImpl teaService) {
        this.teaService = teaService;
    }

    @GetMapping("/")
    public List<Tea> getAll() {
        return teaService.getAll();
    }

}
