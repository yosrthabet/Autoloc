package tn.esprit.ssa8.Services;

import tn.esprit.ssa8.entities.Paiement;

import java.util.List;

public interface IPaiementService {

    Paiement ajouterPaiement(Paiement paiement);

    void supprimerPaiement(Long id);

    List<Paiement> recupererPaiement();

    Paiement modifierPaiement(Paiement paiement);
}