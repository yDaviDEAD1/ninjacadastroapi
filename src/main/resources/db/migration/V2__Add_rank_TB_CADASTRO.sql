-- V2 Migrations para adicionar a coluna de Rank na tabela de cadastros
-- VERSAO__FUNCAO_.SQL
--VERSIONAMENTO DO BANCO DE DADOS
ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);