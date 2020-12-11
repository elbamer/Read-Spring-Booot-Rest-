package com.disenotuweb.Crud.controller;

import ch.qos.logback.core.net.server.Client;
import com.disenotuweb.Crud.entity.Cliente;
import com.disenotuweb.Crud.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")//para hacer las peti ciones
public class ClienteRestController {
    //implementar el servicio
    //imyectamos nuestrro objeto con Autowired
    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente>getClientes(){
    return clienteService.getClientes();
}


    @GetMapping("/clientes/{id}")
    public Cliente getClientes(@PathVariable Long id){
        return clienteService.getCliente(id);
    }

    @PostMapping("/guardar")
               public Cliente guardar(@RequestBody Cliente cliente) {//Lo enviamos dentro
        return clienteService.guardar(cliente);
    }
    @PutMapping("/actualizar/{id}")
    public Cliente actualizar(@RequestBody Cliente cliente , @PathVariable Long id){
      Cliente clienteActual = clienteService.getCliente(id);
        clienteActual.setNombre(cliente.getNombre());
        clienteActual.setApellido(cliente.getApellido());
        clienteActual.setEmail(cliente.getEmail());
        return clienteService.guardar(clienteActual);
    }}