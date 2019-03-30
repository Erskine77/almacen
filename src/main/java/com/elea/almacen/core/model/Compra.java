package com.elea.almacen.core.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="compra")

public class Compra implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_compra")
    private Long idCompra;
    
    @Column(name="numero_documento")
    private Long numeroDocumento;
    
    @ManyToOne(fetch=FetchType.LAZY) //relacion
    @JoinColumn(name="codigo_proveedor") //nombre campo BD
    private Proveedor proveedor;
    
    @Column(name="fecha")
    private Date fecha;
    
    @Column(name="total")
    private Double total;

    public Compra() {
    }

    public Compra(Long idCompra, Long numeroDocumento, Proveedor proveedor, Date fecha, Double total) {
        this.idCompra = idCompra;
        this.numeroDocumento = numeroDocumento;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.total = total;
    }

    public Long getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Long idCompra) {
        this.idCompra = idCompra;
    }

    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    
    
}
