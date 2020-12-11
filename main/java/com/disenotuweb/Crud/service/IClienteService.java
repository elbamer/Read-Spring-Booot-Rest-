package com.disenotuweb.Crud.service;

import com.disenotuweb.Crud.entity.Cliente;

import java.util.List;

public interface IClienteService {
    //Devuelve una lista de tipo empleado
    public List<Cliente> findAll();

}
