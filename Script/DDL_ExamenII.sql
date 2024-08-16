-- database: ../DataBase/DB_ExamenII.sqlite
/*
Autor : Sebastian Oña
Fecha : 15.julio.2k24
Script: Insertando MER
*/

DROP TABLE IF EXISTS SOCatalogoTipo;
DROP TABLE IF EXISTS SOCatalogo;
DROP TABLE IF EXISTS SOLocalidad;
DROP TABLE IF EXISTS SOAlimento;
DROP TABLE IF EXISTS SOHormiga;

CREATE TABLE SOCatalogoTipo (
   IdCatalogoTipo   INTEGER NOT NULL PRIMARY KEY autoincrement 
  ,Nombre           VARCHAR(30) NOT NULL UNIQUE

  ,Estado           VARCHAR(1) NOT NULL DEFAULT('A')
  ,FechaCreacion    DATETIME DEFAULT(datetime('now','localtime'))
  ,FechaModifica    DATETIME
);

CREATE TABLE SOCatalogo(
  IdCatalogo         INTEGER NOT NULL PRIMARY KEY autoincrement 
  ,IdCatalogoTipo    INTEGER NOT NULL REFERENCES SOCatalogoTipo(IdCatalogoTipo)
  ,Nombre            VARCHAR(18) NOT NULL 

  ,Estado           VARCHAR(1) NOT NULL DEFAULT('A')
  ,FechaCreacion    DATETIME DEFAULT(datetime('now','localtime'))
  ,FechaModifica    DATETIME
);

CREATE TABLE SOLocalidad(
    IdLocalidad             INTEGER NOT NULL PRIMARY KEY autoincrement
    ,IdLocalidadPadre       INTEGER REFERENCES SOLocalidad(IdLocalidad)
    ,IdCTLocalidad          INTEGER REFERENCES SOCatalogo(IdCatalogo)
    ,Nombre                 VARCHAR(18) NOT NULL 

    ,Estado                 VARCHAR(1) NOT NULL DEFAULT('A')
    ,FechaCreacion          DATETIME DEFAULT(datetime('now','localtime'))
    ,FechaModifica          DATETIME
);

CREATE TABLE SOAlimento(
  IdAlimento                  INTEGER NOT NULL PRIMARY KEY autoincrement
  ,IdCTAlimento               INTEGER REFERENCES SOCatalogo(IdCatalogo)
  ,Nombre                     VARCHAR(18) NOT NULL 

  ,Estado                     VARCHAR(1) NOT NULL DEFAULT('A')
  ,FechaCreacion              DATETIME DEFAULT(datetime('now','localtime'))
  ,FechaModifica              DATETIME
);

CREATE TABLE SOHormiga(
  IdHormiga                     INTEGER NOT NULL PRIMARY KEY autoincrement
  ,TipoHormiga                  INTEGER REFERENCES SOCatalogo(IdCatalogo)
  ,Localidad                    INTEGER REFERENCES SOLocalidad(IdLocalidad)
  ,Sexo                         INTEGER REFERENCES SOCatalogo(IdCatalogo)
  ,IngestaNativa                INTEGER REFERENCES SOAlimento(IdAlimento)
  ,GenoAlimento                 INTEGER REFERENCES SOAlimento(IdAlimento)
  
  ,Estado                       VARCHAR(18) NOT NULL 
  ,FechaCreacion                DATETIME DEFAULT(datetime('now','localtime'))
  ,FechaModifica                DATETIME
);

SELECT IdHormiga
, TipoHormiga
, Localidad
, Sexo
, IngestaNativa
, GenoAlimento
, Estado
,FechaCreacion 
,FechaModifica
FROM Hormiga 
Where Estado = 'A'