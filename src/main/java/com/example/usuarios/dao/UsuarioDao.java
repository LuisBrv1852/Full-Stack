package com.example.usuarios.dao;

import com.example.usuarios.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();


    void eliminar(Long id);

    void registrarUsuarios(Usuario usuario);

    Usuario obtenerUsuarioPorCredenciales(Usuario usuario);
}
