package Model

import AbstractModel.Genero

class Leite(nome: String) : Genero(nome) {
    init {
        this.nome = nome;
    }
}