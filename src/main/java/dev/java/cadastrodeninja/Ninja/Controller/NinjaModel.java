package dev.java.cadastrodeninja.Ninja.Controller;

import dev.java.cadastrodeninja.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

//Entity transforma uma classe em uma entidade do DB
// Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // @ManyToOne Um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id")  //Foreing Key ou chave estrangeira
    private MissoesModel missoes;

}
