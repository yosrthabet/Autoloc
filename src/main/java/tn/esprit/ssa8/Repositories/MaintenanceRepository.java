package tn.esprit.ssa8.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ssa8.entities.Maintenance;
@Repository
public interface MaintenanceRepository extends JpaRepository<Maintenance,Long> {
}
