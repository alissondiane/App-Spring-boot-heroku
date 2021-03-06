package com.alisson.springboot.datajpa.app.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.alisson.springboot.datajpa.app.model.entity.Factura;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IFacturaDao extends JpaRepository<Factura,Long> {
	@Query("select f from Factura f join fetch f.cliente c join fetch f.items l join fetch l.producto where f.id=?1")
	public Factura fetchByIdWithClienteWithItemFacturaWithProcucto(Long id);
}

//JPArepository