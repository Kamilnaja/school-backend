package com.school.app.service;

import com.school.app.repository.RokRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.school.app.model.Rok;

import java.util.ArrayList;
import java.util.List;

@Service
public class RokService {
    @Autowired
    RokRepository rokSzkolnyRepository;

    public Rok getRokByID(int id) {
        return rokSzkolnyRepository.findById(id).get();
    }

    public List<Rok> getAllYears() {
        List<Rok> lataSzkolne = new ArrayList<Rok>();
        for (Rok rok : rokSzkolnyRepository.findAll()) {
            lataSzkolne.add(rok);
        }
        return lataSzkolne;
    }

    public Rok getYearById(int i) {
        return rokSzkolnyRepository.findById(i).get();
    }
}