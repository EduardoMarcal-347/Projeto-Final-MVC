package com.ProjetoFinal.SwapBooks.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ProjetoFinal.SwapBooks.model.Usuario;

@Repository
public class UsuarioRepository {
    @Autowired
    JdbcTemplate jdbc;

    public void save(Usuario usuario) {
        String sql = "insert into su"
    }
    
}
