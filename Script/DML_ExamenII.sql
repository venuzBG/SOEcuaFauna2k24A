-- database: ../DataBase/DB_ExamenII.sqlite

INSERT INTO SOCatalogoTipo
 (Nombre            ) VALUES
 ('TipoHormiga'     )
,('Sexo'            )
,('LocalidadTipo'   )
,('Alimento'        );

INSERT INTO SOCatalogo
(IdCatalogoTipo  ,Nombre            ) VALUES
(1               ,'Reina'           )
,(1              ,'Larva'           )
,(1              ,'Rastreadora'     )
,(1              ,'Soldado'         )
,(1              ,'Zangano'         )
,(2              ,'Macho'           )
,(2              ,'Hembra'          )
,(2              ,'Asexual'         )
,(3              ,'Pais'            )
,(3              ,'Region'          )
,(3              ,'Provincia'       )
,(4              ,'IngestaNativa'   )
,(4              ,'GenoAlimento'    );

INSERT INTO SOLocalidad
(IdLocalidadPadre  ,IdCTLocalidad           ,Nombre    ) VALUES
(NULL              ,9                      ,'Ecuador' )
,(1                ,10                      ,'Costa'   )
,(1                ,10                      ,'Sierra'  )
,(1                ,10                      ,'Oriente' );

INSERT INTO SOLocalidad
(IdLocalidadPadre  ,IdCTLocalidad           ,Nombre                          ) VALUES
 (1                ,10                      ,'Insular'                       ) 
 
,(2                ,11                      ,'Esmeraldas'                    )
,(2                ,11                      ,'Santo Domingo de los Tsáchilas')
,(2                ,11                      ,'Manabí'                        )
,(2                ,11                      ,'Los Ríos'                      )
,(2                ,11                      ,'Guayas'                        )
,(2                ,11                      ,'Santa Elena'                   )
,(2                ,11                      ,'El Oro'                        )

,(3                ,11                      ,'Carchi'                        )
,(3                ,11                      ,'Imbabura'                      )
,(3                ,11                      ,'Pichincha'                     )
,(3                ,11                      ,'Cotopaxi'                      )
,(3                ,11                      ,'Tungurahua'                    )
,(3                ,11                      ,'Bolívar'                       )
,(3                ,11                      ,'Chimborazo'                    )
,(3                ,11                      ,'Cañar'                         )
,(3                ,11                      ,'Azuay'                         )
,(3                ,11                      ,'Loja'                          )

,(4                ,11                      ,'Sucumbíos'                     )
,(4                ,11                      ,'Napo'                          )
,(4                ,11                      ,'Orellana'                      )
,(4                ,11                      ,'Pastaza'                       )
,(4                ,11                      ,'Morona Santiago'               )
,(4                ,11                      ,'Zamora Chinchipe'              )


,(5                ,11                      ,'Galápagos'                     );

INSERT INTO SOAlimento
(IdCTAlimento             ,Nombre    ) VALUES
(12                       ,'Carnívoro'   ) 
,(12                      ,'Herbívoro'   ) 
,(12                      ,'Omnívoro'    ) 
,(12                      ,'Insectívoros') 
,(13                      ,'X'           ) 
,(13                      ,'XX'          ) 
,(13                      ,'XY'          );

INSERT INTO Hormiga 
(TipoHormiga, Localidad, Sexo,IngestaNativa, GenoAlimento) VALUES
(1,19,9,3,7)
,(5,19,9,3,7);