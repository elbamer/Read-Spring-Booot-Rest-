package com.disenotuweb.Crud.service;

import com.disenotuweb.Crud.entity.Cliente;

import java.util.List;

public interface IClienteService {// metodos que luego tenemos que impleemtar en IClienteServiceImpl
    //Devuelve una lista de tipo empleado
    public List<Cliente> getClientes();

    public Cliente getCliente(Long id);

    public Cliente guardar(Cliente cliente);//Recibe el objeto cliente
}
