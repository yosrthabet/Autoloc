package tn.esprit.ssa8.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ssa8.Services.IMaintenanceService;
import tn.esprit.ssa8.entities.Maintenance;

import java.util.List;

@RequestMapping("/Maintenance")
@RestController
@AllArgsConstructor
public class MaintenanceController {

    private IMaintenanceService maintenanceService;

    @PostMapping("/AjouterMaintenance")
    public Maintenance ajouterMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.ajouterMaintenance(maintenance);
    }

    @DeleteMapping("/supprimerMaintenance/{id}")
    public void supprimerMaintenance(@PathVariable Long id) {
        maintenanceService.supprimerMaintenance(id);
    }

    @GetMapping("/getMaintenances")
    public List<Maintenance> afficherMaintenances() {
        return maintenanceService.recupererMaintenance();
    }

    @PutMapping("/modifierMaintenance")
    public Maintenance modifierMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.modifierMaintenance(maintenance);
    }
}