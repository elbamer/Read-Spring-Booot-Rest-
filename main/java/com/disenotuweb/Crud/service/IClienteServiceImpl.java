package com.disenotuweb.Crud.service;

import com.disenotuweb.Crud.Dao.IClientesDao;
import com.disenotuweb.Crud.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**Para que detecte un servicio lo decoramos con la anotacion service**/
@Service
public class IClienteServiceImpl implements IClienteService{
    /**Utilizamos nuestra calse DAO**/

    @Autowired// inyectamos
    public IClientesDao clienteDao;
    @Override
    //public List<Cliente> findAll() {
    public List<Cliente> getClientes() {

        return (List<Cliente>) clienteDao.findAll();
    }/** implementacion**/

    @Override
    public Cliente getCliente(Long id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return clienteDao.save(cliente);// sirve para guaradar como para actualizar los datos
    }


}
