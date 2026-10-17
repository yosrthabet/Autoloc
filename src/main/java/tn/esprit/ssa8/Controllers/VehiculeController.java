package tn.esprit.ssa8.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ssa8.Services.IVehiculeService;
import tn.esprit.ssa8.entities.Vehicule;

import java.util.List;

@RequestMapping("/Vehicule")
@RestController
@AllArgsConstructor
public class VehiculeController {

    private IVehiculeService vehiculeService;

    @PostMapping("/AjouterVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajouterVehicule(vehicule);
    }

    @DeleteMapping("/supprimerVehicule/{id}")
    public void supprimerVehicule(@PathVariable Long id) {
        vehiculeService.supprimerVehicule(id);
    }

    @GetMapping("/getVehicules")
    public List<Vehicule> afficherVehicules() {
        return vehiculeService.recupererVehicule();
    }

    @PutMapping("/modifierVehicule")
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.modifierVehicule(vehicule);
    }
}