package com.diego.IngWeb.Services;

import com.diego.IngWeb.Entities.Pedido;
import com.diego.IngWeb.Repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoReporitory;

    public Pedido createPedido(Pedido pedido){
        Pedido pedido1 = pedidoReporitory.save(pedido);
        return pedido1;
    }

}
