-- database: ../DataBase/DB_ExamenII.sqlite
/*
Autor : Sebastian Oña
Fecha : 15.julio.2k24
Script: Insertando MER
*/

DROP TABLE IF EXISTS CatalogoTipo;
DROP TABLE IF EXISTS Catalogo;

CREATE TABLE catalogoTipo (
   IdCatalogoTipo   INTEGER NOT NULL PRIMARY KEY autoincrement 
  ,Nombre           VARCHAR(30) NOT NULL UNIQUE

  ,Estado           VARCHAR(1) NOT NULL DEFAULT('A')
  ,FechaCreacion    DATETIME DEFAULT(datetime('now','localtime'))
  ,FechaModifica    DATETIME
);

CREATE TABLE Catalogo(
  IdCatalogo         INTEGER NOT NULL PRIMARY KEY autoincrement 
  ,IdCatalogoTipo    INTEGER NOT NULL REFERENCES CatalogoTipo(IdCatalogoTipo)
  ,Nombre            VARCHAR(18) NOT NULL UNIQUE

  ,Estado           VARCHAR(1) NOT NULL DEFAULT('A')
  ,FechaCreacion    DATETIME DEFAULT(datetime('now','localtime'))
  ,FechaModifica    DATETIME
);
