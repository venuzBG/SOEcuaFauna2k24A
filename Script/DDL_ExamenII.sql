-- database: ../DataBase/DB_ExamenII.sqlite
/*
Autor : Sebastian Oña
Fecha : 15.julio.2k24
Script: Insertando MER
*/

DROP TABLE IF EXISTS CatalogoTipo;
DROP TABLE IF EXISTS Catalogo;
DROP TABLE IF EXISTS Localidad;
DROP TABLE IF EXISTS Alimento;
DROP TABLE IF EXISTS Hormiga;

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
  ,Nombre            VARCHAR(18) NOT NULL 

  ,Estado           VARCHAR(1) NOT NULL DEFAULT('A')
  ,FechaCreacion    DATETIME DEFAULT(datetime('now','localtime'))
  ,FechaModifica    DATETIME
);

CREATE TABLE Localidad(
    IdLocalidad             INTEGER NOT NULL PRIMARY KEY autoincrement
    ,IdLocalidadPadre       INTEGER REFERENCES Localidad(IdLocalidad)
    ,IdCTLocalidad          INTEGER REFERENCES Catalogo(IdCatalogo)
    ,Nombre                 VARCHAR(18) NOT NULL 

    ,Estado                 VARCHAR(1) NOT NULL DEFAULT('A')
    ,FechaCreacion          DATETIME DEFAULT(datetime('now','localtime'))
    ,FechaModifica          DATETIME
);

CREATE TABLE Alimento(
  IdAlimento                  INTEGER NOT NULL PRIMARY KEY autoincrement
  ,IdCTAlimento               INTEGER REFERENCES Catalogo(IdCatalogo)
  ,Nombre                     VARCHAR(18) NOT NULL 

  ,Estado                     VARCHAR(1) NOT NULL DEFAULT('A')
  ,FechaCreacion              DATETIME DEFAULT(datetime('now','localtime'))
  ,FechaModifica              DATETIME
);

CREATE TABLE Hormiga(
  IdHormiga                     INTEGER NOT NULL PRIMARY KEY autoincrement
  ,TipoHormiga                  INTEGER REFERENCES Catalogo(IdCatalogo)
  ,Localidad                    INTEGER REFERENCES Localidad(IdLocalidad)
  ,Sexo                         INTEGER REFERENCES Catalogo(IdCatalogo)
  ,IngestaNativa                INTEGER REFERENCES Alimento(IdAlimento)
  ,GenoAlimento                 INTEGER REFERENCES Alimento(IdAlimento)
  
  ,Estado                       VARCHAR(1) NOT NULL DEFAULT('A')
  ,FechaCreacion                DATETIME NOT NULL
  ,FechaModifica                DATETIME
);