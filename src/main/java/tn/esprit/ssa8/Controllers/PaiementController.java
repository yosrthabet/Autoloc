package tn.esprit.ssa8.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ssa8.Services.IPaiementService;
import tn.esprit.ssa8.entities.Paiement;

import java.util.List;

@RequestMapping("/Paiement")
@RestController
@AllArgsConstructor
public class PaiementController {

    private IPaiementService paiementService;

    @PostMapping("/AjouterPaiement")
    public Paiement ajouterPaiement(@RequestBody Paiement paiement) {
        return paiementService.ajouterPaiement(paiement);
    }

    @DeleteMapping("/supprimerPaiement/{id}")
    public void supprimerPaiement(@PathVariable Long id) {
        paiementService.supprimerPaiement(id);
    }

    @GetMapping("/getPaiements")
    public List<Paiement> afficherPaiements() {
        return paiementService.recupererPaiement();
    }

    @PutMapping("/modifierPaiement")
    public Paiement modifierPaiement(@RequestBody Paiement paiement) {
        return paiementService.modifierPaiement(paiement);
    }
}