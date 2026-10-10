package tn.esprit.ssa8.Services;

import tn.esprit.ssa8.entities.Reservation;

import java.util.List;

public interface IReservationService {

    Reservation ajouterReservation(Reservation reservation);

    void supprimerReservation(Long id);

    List<Reservation> recupererReservation();

    Reservation modifierReservation(Reservation reservation);
}