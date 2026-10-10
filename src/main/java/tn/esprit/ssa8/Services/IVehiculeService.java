package tn.esprit.ssa8.Services;

import tn.esprit.ssa8.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {

    Vehicule ajouterVehicule(Vehicule vehicule);

    void supprimerVehicule(Long id);

    List<Vehicule> recupererVehicule();

    Vehicule modifierVehicule(Vehicule vehicule);
}