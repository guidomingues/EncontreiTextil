package com.encontreiTextil.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3, max = 80, message = "Nome deve ser inserido, de 3 até 80 caracteres")
    private String nomeCompleto;

    @NotBlank
    @Size(min = 2, max = 200, message = "Endereço deve ser inserido, de 2 até 200 caracteres")
    private String endereco;

    @NotBlank
    private long cpf;

    @NotBlank
    @Size(min = 3, max =45, message = "Usúario deve ser inserido, de 3 até 45 caracteres")
    private String nomeUsuario;

    @NotBlank
    @Size(min = 3, max =45,message = "Email deve ser inserido, de 3 até 45 caracteres")
    private String email;
    @NotBlank
    @Size(min = 6, max =8,message = "senha deve ser inserido, de 6 até 8 caracteres")
    private String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
