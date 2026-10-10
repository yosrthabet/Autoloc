package tn.esprit.ssa8.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ssa8.entities.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
