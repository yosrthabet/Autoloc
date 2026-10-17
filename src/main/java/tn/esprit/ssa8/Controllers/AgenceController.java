package tn.esprit.ssa8.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ssa8.Services.IAgenceService;
import tn.esprit.ssa8.entities.Agence;

import java.util.List;

@RequestMapping("/Agence")
@RestController
@AllArgsConstructor
public class AgenceController {

    private IAgenceService agenceService;

    @PostMapping("/AjouterAgence")
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.ajouterAgence(agence);
    }

    @DeleteMapping("/supprimerAgence/{id}")
    public void supprimerAgence(@PathVariable Long id) {
        agenceService.supprimerAgence(id);
    }

    @GetMapping("/getAgences")
    public List<Agence> afficherAgences() {
        return agenceService.recupererAgence();
    }

    @PutMapping("/modifierAgence")
    public Agence modifierAgence(@RequestBody Agence agence) {
        return agenceService.modifierAgence(agence);
    }
}