package ie.atu.week7solution.service;

import ie.atu.week7solution.model.Reservation;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationService {

    private List<Reservation> reservations = new ArrayList<>();
    private long nextId = 1;

    public ReservationService(ReservationService reservationService) {

        reservation.setReservationId(nextId++);

        for (Reservation existing : reservations){
            if (existing.getReservationId() == nextId){}
        }
    }

    public Reservation addReservation(@Valid Reservation reservation) {

        return new Reservation();
    }
}
