package fr.aggoun.hotel.web;

import fr.aggoun.hotel.entity.Reservation;
import fr.aggoun.hotel.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationController {
    private ReservationRepository reservationRepository;

    @GetMapping("reservations")
    public List<Reservation> reservationList(){
       return reservationRepository.findAll();
    }
}
