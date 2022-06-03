package com.diego.IngWeb.Services;

import com.diego.IngWeb.Entities.Reservacion;
import com.diego.IngWeb.Repositories.ReservacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservacionService {

    @Autowired
    private ReservacionRepository reservacionRepository;

    public Reservacion createReservacion(Reservacion reservacion){
        Reservacion reservacion1 = reservacionRepository.save(reservacion);
        return  reservacion1;
    }
}
