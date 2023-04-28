package com.example.demandeeeee.controller;

import com.example.demandeeeee.model.Demande;
import com.example.demandeeeee.model.Employer;
import com.example.demandeeeee.repository.DemandeRepo;
import com.example.demandeeeee.repository.EmployerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:9002/validation")
@RequestMapping("/employer")
@RestController
public class EmployerController {
    @Autowired
    private EmployerRepo employer;

    @GetMapping ("/emplyers")
    public List<Employer> getAll()
    {

        return  employer.findAll();

    }




}