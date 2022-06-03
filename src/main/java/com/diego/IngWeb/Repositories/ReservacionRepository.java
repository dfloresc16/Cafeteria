package com.diego.IngWeb.Repositories;

import com.diego.IngWeb.Entities.Reservacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservacionRepository extends JpaRepository<Reservacion,Integer> {

}
