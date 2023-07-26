package pl.przykladowastrona.strona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.przykladowastrona.strona.model.Rok;
import pl.przykladowastrona.strona.service.RokService;

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
