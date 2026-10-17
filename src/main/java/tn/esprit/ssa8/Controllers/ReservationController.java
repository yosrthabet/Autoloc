package tn.esprit.ssa8.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ssa8.Services.IReservationService;
import tn.esprit.ssa8.entities.Reservation;

import java.util.List;

@RequestMapping("/Reservation")
@RestController
@AllArgsConstructor
public class ReservationController {

    private IReservationService reservationService;

    @PostMapping("/AjouterReservation")
    public Reservation ajouterReservation(@RequestBody Reservation reservation) {
        return reservationService.ajouterReservation(reservation);
    }

    @DeleteMapping("/supprimerReservation/{id}")
    public void supprimerReservation(@PathVariable Long id) {
        reservationService.supprimerReservation(id);
    }

    @GetMapping("/getReservations")
    public List<Reservation> afficherReservations() {
        return reservationService.recupererReservation();
    }

    @PutMapping("/modifierReservation")
    public Reservation modifierReservation(@RequestBody Reservation reservation) {
        return reservationService.modifierReservation(reservation);
    }
}