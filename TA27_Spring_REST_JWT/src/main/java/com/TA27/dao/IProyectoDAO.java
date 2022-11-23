package com.TA27.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.TA27.dto.Proyecto;

public interface IProyectoDAO extends JpaRepository<Proyecto, Long>{
	
}
