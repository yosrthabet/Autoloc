package tn.esprit.ssa8.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ssa8.entities.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}