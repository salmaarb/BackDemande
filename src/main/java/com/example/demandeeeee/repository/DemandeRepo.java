package com.example.demandeeeee.repository;

import com.example.demandeeeee.model.Demande;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;

public interface DemandeRepo extends JpaRepository<Demande, Integer> {

    @Query("SELECT date_debut  FROM Demande where  id_demande=:id")
    Date getDateDebut(@Param("id") int id);
    @Query("SELECT date_fin  FROM Demande where  id_demande=:id")
    Date getDateFin(@Param("id") int id);
    @Query("SELECT e.solde  FROM Employer e where  e.id_emp=:id")
    int getSolde(@Param("id") int id);

    @Transactional
    @Modifying
    @Query("UPDATE Employer e SET e.solde = :n WHERE e.id_emp = :id")
    void updateSolde(@Param("n") int n, @Param("id") int id);



    @Transactional
    @Modifying
    @Query("UPDATE  Demande d  SET d.etat =:n  WHERE d.id_demande = :id")
    void updateEtat( @Param("n") boolean n,@Param("id") int id);


}
