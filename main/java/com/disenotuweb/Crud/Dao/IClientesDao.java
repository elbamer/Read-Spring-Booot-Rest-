package com.disenotuweb.Crud.Dao;

import com.disenotuweb.Crud.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClientesDao extends CrudRepository <Cliente, Long>{
    //Objeto empleado y el tipo del identificador y heredamos de CrudRepository


}
