-- database: ../DataBase/DB_ExamenII.sqlite

INSERT INTO CatalogoTipo
 (Nombre            ) VALUES
 ('TipoHormiga'     )
,('Sexo'            )
,('LocalidadTipo'   )
,('Alimento'        );

INSERT INTO Catalogo
(IdCatalogoTipo  ,Nombre            ) VALUES
(1               ,'Reina'           )
,(1              ,'Larva'           )
,(1              ,'Rastrera'        )
,(1              ,'Soldado'         )
,(1              ,'Obrera'          )
,(1              ,'Macho'           )
,(1              ,'Aladas'          )
,(2              ,'Macho'           )
,(2              ,'Hembra'          )
,(2              ,'Asexual'         )
,(3              ,'Pais'            )
,(3              ,'Region'          )
,(3              ,'Provincia'       )
,(4              ,'IngestaNativa'   )
,(4              ,'GenoAlimento'    );

INSERT INTO Localidad
(IdLocalidadPadre  ,IdCTLocalidad           ,Nombre    ) VALUES
(NULL              ,11                      ,'Ecuador' )
,(1                ,12                      ,'Costa'   )
,(1                ,12                      ,'Sierra'  )
,(1                ,12                      ,'Oriente' );

INSERT INTO Localidad
(IdLocalidadPadre  ,IdCTLocalidad           ,Nombre                          ) VALUES
 (1                ,12                      ,'Insular'                       ) 
 
,(2                ,13                      ,'Esmeraldas'                    )
,(2                ,13                      ,'Santo Domingo de los Tsáchilas')
,(2                ,13                      ,'Manabí'                        )
,(2                ,13                      ,'Los Ríos'                      )
,(2                ,13                      ,'Guayas'                        )
,(2                ,13                      ,'Santa Elena'                   )
,(2                ,13                      ,'El Oro'                        )

,(3                ,13                      ,'Carchi'                        )
,(3                ,13                      ,'Imbabura'                      )
,(3                ,13                      ,'Pichincha'                     )
,(3                ,13                      ,'Cotopaxi'                      )
,(3                ,13                      ,'Tungurahua'                    )
,(3                ,13                      ,'Bolívar'                       )
,(3                ,13                      ,'Chimborazo'                    )
,(3                ,13                      ,'Cañar'                         )
,(3                ,13                      ,'Azuay'                         )
,(3                ,13                      ,'Loja'                          )

,(4                ,13                      ,'Sucumbíos'                     )
,(4                ,13                      ,'Napo'                          )
,(4                ,13                      ,'Orellana'                      )
,(4                ,13                      ,'Pastaza'                       )
,(4                ,13                      ,'Morona Santiago'               )
,(4                ,13                      ,'Zamora Chinchipe'              )


,(5                ,13                      ,'Galápagos'                     );

INSERT INTO Alimento
(IdCTAlimento             ,Nombre    ) VALUES
(14                       ,'Carnívoro'   ) 
,(14                      ,'Herbívoro'   ) 
,(14                      ,'Omnívoro'    ) 
,(14                      ,'Insectívoros') 
,(15                      ,'X'           ) 
,(15                      ,'XX'          ) 
,(15                      ,'XY'          );