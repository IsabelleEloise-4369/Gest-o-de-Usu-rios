package com.desafio.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Indica que esta classe é uma entidade JPA
@Data // Gera automaticamente os métodos getter, setter, toString e equals
@AllArgsConstructor // Cria um construtor com todos os campos
@NoArgsConstructor // Cria um construtor vazio
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento da chave primária
    private Long id;
    private String nome;
    private String email;
}