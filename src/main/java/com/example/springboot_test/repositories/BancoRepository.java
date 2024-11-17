package com.example.springboot_test.repositories;

import com.example.springboot_test.models.Banco;

import java.util.List;

public interface BancoRepository {

    List<Banco> findAll(Long id);
    Banco findById(Long id);
    void update(Banco banco);
}
