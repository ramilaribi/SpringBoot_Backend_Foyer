package tn.esprit.tpfoyer.control;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.service.IReservationService;

import java.util.List;

@Tag(name = "Gestion de reservation")
@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {
    IReservationService reservationService;
@Operation(description = "récupérer toutes les reservation de la base de donneés  ")
    // http://localhost:8089/tpfoyer/reservation/retrieve-all-reservation
    @GetMapping("/retrieve-all-reservation")
    public List<Reservation> getReservation() {
        List<Reservation> listReservation = reservationService.retrieveAllReservations();
        return listReservation;
    }
    @Operation(description = "récuprérer la reservation de la base de données à partir de son identifiant")
    // http://localhost:8089/tpfoyer/reservation/retrieve-reservation/8
    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") String rId) {
        Reservation reservation = reservationService.retrieveReservation(rId);
        return reservation;
    }
    @Operation(description = "Ajouter une reservation à la base de donneés")
    // http://localhost:8089/tpfoyer/reservation/add-reservation
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation c) {
        Reservation reservation = reservationService.addReservation(c);
        return reservation;
    }
    @Operation(description = "supprmier une reservation avec un identifiant specifique de la base de donneés")
    // http://localhost:8089/tpfoyer/reservation/remove-reservation/{reservation-id}
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") String rId) {
        reservationService.removeReservation(rId);
    }
    @Operation(description = "modifier une reservation avec un identifiant specifique de la base de donneés")
    // http://localhost:8089/tpfoyer/reservation/modify-reservation
    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation c) {
        Reservation reservation = reservationService.modifyReservation(c);
        return reservation;
    }
}
