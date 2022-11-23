package com.TA27.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.TA27.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}