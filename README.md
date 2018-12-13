# Udacity Android Basics Nanodegree - Projeto 5 (Report Card)

Este projeto consiste na criação de uma classe utilitária em Java para representar um boletim escolar que possui as seguintes características:
- constantes estáticas que representam as possíveis disciplinas (Matemática, Química, Biologia, etc) 
- constantes estáticas que representam os 4 trimestres do ano
- membros da classe:
  - nome da classe do aluno ao qual o boletim representa (Ex: "Quinta série")
  - ano da classe do aluno
  - comentários do professor
  - array bi-dimensional para armazenar as notas do aluno por disciplina e trimestre
- construtor para inicializar os objetos com o nome e ano da classe do aluno
- _setters_ para alterar  cada membro da classe e informar a nota de uma disciplina específica num determinado trimestre
- _getters_ para recuperar cada menmbro da classe e a nota de uma disciplina específica num determinado trimestre
- método para serializar os objetos numa _string_

**OBS:** Também foi implementado um mecanismo de tratamento de exceções para disciplinas e trimestres inválidos.

## Copyright

Esse projeto foi desenvolvido por Márcio Souza de Oliveira em 13/09/2016.
