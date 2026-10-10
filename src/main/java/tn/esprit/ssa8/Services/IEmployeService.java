package tn.esprit.ssa8.Services;

import tn.esprit.ssa8.entities.Employe;

import java.util.List;

public interface IEmployeService {

    Employe ajouterEmploye(Employe employe);

    void supprimerEmploye(Long id);

    List<Employe> recupererEmploye();

    Employe modifierEmploye(Employe employe);
}