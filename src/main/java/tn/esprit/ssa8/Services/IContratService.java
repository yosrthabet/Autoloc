package tn.esprit.ssa8.Services;

import tn.esprit.ssa8.entities.Contrat;

import java.util.List;

public interface IContratService {

    Contrat ajouterContrat(Contrat contrat);

    void supprimerContrat(Long id);

    List<Contrat> recupererContrat();

    Contrat modifierContrat(Contrat contrat);
}