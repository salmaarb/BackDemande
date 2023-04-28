package com.example.demandeeeee.controller;

import com.example.demandeeeee.beans.userBeans;
import com.example.demandeeeee.model.Demande;
import com.example.demandeeeee.proxy.MicroserviceUserProxy;
import com.example.demandeeeee.repository.DemandeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = {"http://localhost:9002/validation","http://localhost:3000","http://localhost:8081"})
@RequestMapping("/demande")
@RestController
public class DemandeController {
    @Autowired
    private DemandeRepo demande;
 //   @Autowired

  //  private MicroserviceUserProxy mm;
    @PostMapping("/ajout")
    public String save(@RequestBody Demande demandee)
    {//long v=demande.getSolde(1);
      //  if(v>=1 && v<=22) {
    demande.save(demandee);
    return "demande bien ajoute";


}
    @GetMapping("/demande/{id}")
    public Optional<Demande> get(@PathVariable int id)
    {
        Optional<Demande> d= demande.findById(id);
        return  d;

    }
    @GetMapping ("/solde/{id}")
    int getSolde(@PathVariable int id){
        return demande.getSolde(id);
    }
    @PutMapping ("/solde/{n}/{id}")
    void updateSolde(@PathVariable int n,@PathVariable int id){
        demande.updateSolde(n,id);
    }

    @PutMapping ("/etat/{id}")
    void updateEtat(@PathVariable int id){
        demande.updateEtat(true,id);
    }
 //   @GetMapping ("/api/auth/userr")
  //  public Long getUserById()
   // {
       // long user = mm.getUserId();
       //return user;
   // }

    @GetMapping ("/all")
    public List<Demande> getAll()
    {
        List<Demande> demandes = demande.findAll();
        return  demandes;

    }
    @GetMapping ("/dateDebut/{id}")
    public Date getDateDebut(@PathVariable int id)
    {
        return  demande.getDateDebut(id);
    }
    @GetMapping ("/dateFin/{id}")
    public Date getDateFin(@PathVariable int id)
    {
        return  demande.getDateFin(id);
    }




}
