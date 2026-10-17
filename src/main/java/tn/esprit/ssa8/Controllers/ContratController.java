package tn.esprit.ssa8.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ssa8.Services.IContratService;
import tn.esprit.ssa8.entities.Contrat;

import java.util.List;

@RequestMapping("/Contrat")
@RestController
@AllArgsConstructor
public class ContratController {

    private IContratService contratService;

    @PostMapping("/AjouterContrat")
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return contratService.ajouterContrat(contrat);
    }

    @DeleteMapping("/supprimerContrat/{id}")
    public void supprimerContrat(@PathVariable Long id) {
        contratService.supprimerContrat(id);
    }

    @GetMapping("/getContrats")
    public List<Contrat> afficherContrats() {
        return contratService.recupererContrat();
    }

    @PutMapping("/modifierContrat")
    public Contrat modifierContrat(@RequestBody Contrat contrat) {
        return contratService.modifierContrat(contrat);
    }
}