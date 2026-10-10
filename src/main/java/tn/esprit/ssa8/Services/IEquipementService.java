package tn.esprit.ssa8.Services;

import tn.esprit.ssa8.entities.Equipement;

import java.util.List;

public interface IEquipementService {

    Equipement ajouterEquipement(Equipement equipement);

    void supprimerEquipement(Long id);

    List<Equipement> recupererEquipement();

    Equipement modifierEquipement(Equipement equipement);
}