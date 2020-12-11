package com.disenotuweb.Crud.controller;

import com.disenotuweb.Crud.entity.Cliente;
import com.disenotuweb.Crud.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")//para hacer las peticiones
public class ClienteRestController {
//implementar el servicio
    //imyectamos nuestrro objeto con autowirer
    @Autowired

    private IClienteService clienteService;
    @GetMapping("/clientes")
public List<Cliente>getCliente(){
    return clienteService.findAll();
}
}
