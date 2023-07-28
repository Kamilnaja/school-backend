package com.school.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.school.app.model.Rok;
import com.school.app.service.RokService;

import java.util.List;

@RestController
public class RokController {
    @Autowired
    RokService rokService;

    @GetMapping("/rok")
    public List<Rok> rok() {
        return rokService.getAllYears();
    }

    @GetMapping("/rokid")
    public Rok rokId() {
        return rokService.getYearById(1);
    }
}
