package tn.esprit.ssa8.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ssa8.Services.IEquipementService;
import tn.esprit.ssa8.entities.Equipement;

import java.util.List;

@RequestMapping("/Equipement")
@RestController
@AllArgsConstructor
public class EquipementController {

    private IEquipementService equipementService;

    @PostMapping("/AjouterEquipement")
    public Equipement ajouterEquipement(@RequestBody Equipement equipement) {
        return equipementService.ajouterEquipement(equipement);
    }

    @DeleteMapping("/supprimerEquipement/{id}")
    public void supprimerEquipement(@PathVariable Long id) {
        equipementService.supprimerEquipement(id);
    }

    @GetMapping("/getEquipements")
    public List<Equipement> afficherEquipements() {
        return equipementService.recupererEquipement();
    }

    @PutMapping("/modifierEquipement")
    public Equipement modifierEquipement(@RequestBody Equipement equipement) {
        return equipementService.modifierEquipement(equipement);
    }
}