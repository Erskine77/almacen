package com.elea.almacen.core.dao;

import com.elea.almacen.core.model.Proveedor;
import com.erskineespaderos.almacen.core.db.Conexion;
import java.util.List;

public class ProveedorDaoImpl implements ProveedorDao{

    @Override
    public List<Proveedor> findAllProveedor() {
        return (List<Proveedor>)Conexion.getInstancia().findAll(Proveedor.class);
    }

    @Override
    public Proveedor findById(Long codigoProveedor) {
        return (Proveedor)Conexion.getInstancia().findById(Proveedor.class,codigoProveedor);
    }

    @Override
    public void saveProveedor(Proveedor elemento) {
        Conexion.getInstancia().save(elemento);
    }

    @Override
    public void deleteProveedor(Proveedor elemento) {
        Conexion.getInstancia().delete(elemento);
    }

    @Override
    public void updateProveedor(Proveedor elemento) {
        Conexion.getInstancia().update(elemento);
    }
    
}
