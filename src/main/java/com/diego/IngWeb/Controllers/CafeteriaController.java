package com.diego.IngWeb.Controllers;

import com.diego.IngWeb.Entities.Pedido;
import com.diego.IngWeb.Entities.Reservacion;
import com.diego.IngWeb.Services.PedidoService;
import com.diego.IngWeb.Services.ReservacionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cafeteria")
public class CafeteriaController {
    private static final Logger log = LoggerFactory.getLogger(CafeteriaController.class);
    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private ReservacionService reservacionService;

    @RequestMapping(value = "/reservacion", method = RequestMethod.POST)
    public ResponseEntity<Reservacion> createReservacion(@RequestBody Reservacion reservacion){
        log.info("{}",reservacion.toString());
        return new ResponseEntity<>(reservacionService.createReservacion(reservacion), HttpStatus.OK);
    }

    @RequestMapping(value = "/pedido", method = RequestMethod.POST)
    public ResponseEntity<Pedido> createPedido(@RequestBody Pedido pedido){
        log.info("{}",pedido.toString());
        return new ResponseEntity<>(pedidoService.createPedido(pedido), HttpStatus.OK);
    }
}
