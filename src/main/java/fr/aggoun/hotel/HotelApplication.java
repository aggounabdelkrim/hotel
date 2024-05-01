package fr.aggoun.hotel;

import fr.aggoun.hotel.entity.ReservatiobStatus;
import fr.aggoun.hotel.entity.Reservation;
import fr.aggoun.hotel.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class HotelApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelApplication.class, args);

    }

    @Bean
    CommandLineRunner commandLineRunner(ReservationRepository reservationRepository) {
        return args -> {
            reservationRepository.save(Reservation.builder().title("RES 1").price(1200.00).date(new Date()).status(ReservatiobStatus.CREATED).build());
            reservationRepository.save(Reservation.builder().title("RES 2").price(1300.00).date(new Date()).status(ReservatiobStatus.COMFORMED).build());
            reservationRepository.save(Reservation.builder().title("RES 3").price(1400.00).date(new Date()).status(ReservatiobStatus.PENDING).build());
            reservationRepository.save(Reservation.builder().title("RES 4").price(1500.00).date(new Date()).status(ReservatiobStatus.CANCELED).build());
        };
    }

}
