package tn.esprit.ssa8.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ssa8.entities.Equipement;

@Repository
public interface EquipementRepository  extends JpaRepository<Equipement,Long> {
}
