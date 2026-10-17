package tn.esprit.ssa8.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ssa8.Services.IEmployeService;
import tn.esprit.ssa8.entities.Employe;

import java.util.List;

@RequestMapping("/Employe")
@RestController
@AllArgsConstructor
public class EmployeController {

    private IEmployeService employeService;

    @PostMapping("/AjouterEmploye")
    public Employe ajouterEmploye(@RequestBody Employe employe) {
        return employeService.ajouterEmploye(employe);
    }

    @DeleteMapping("/supprimerEmploye/{id}")
    public void supprimerEmploye(@PathVariable Long id) {
        employeService.supprimerEmploye(id);
    }

    @GetMapping("/getEmployes")
    public List<Employe> afficherEmployes() {
        return employeService.recupererEmploye();
    }

    @PutMapping("/modifierEmploye")
    public Employe modifierEmploye(@RequestBody Employe employe) {
        return employeService.modifierEmploye(employe);
    }
}