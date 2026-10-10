package tn.esprit.ssa8.Services;

import tn.esprit.ssa8.entities.Agence;

import java.util.List;

public interface IAgenceService {

    Agence ajouterAgence(Agence agence);

    void supprimerAgence(Long id);

    List <Agence> recupererAgence();

    Agence modifierAgence(Agence agence);
}
