package br.shizuca.spconsumer.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "key_pix")
public class KeyPix {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String chave;
}