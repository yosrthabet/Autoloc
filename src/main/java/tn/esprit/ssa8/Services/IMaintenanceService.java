package tn.esprit.ssa8.Services;

import tn.esprit.ssa8.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {

    Maintenance ajouterMaintenance(Maintenance maintenance);

    void supprimerMaintenance(Long id);

    List<Maintenance> recupererMaintenance();

    Maintenance modifierMaintenance(Maintenance maintenance);
}