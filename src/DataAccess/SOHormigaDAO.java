package DataAccess;

import DataAccess.DTO.SOHormigaDTO;
import Framework.PatException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SOHormigaDAO extends SQLiteDataHelper implements SOIDAO<SOHormigaDTO>{

    @Override
    public SOHormigaDTO readBy(Integer id) throws Exception {
        SOHormigaDTO p = new SOHormigaDTO();
        String query =
         "SELECT IdHormiga"
         + " , TipoHormiga"
         + " , Localidad"
         + " , Sexo"
         + " , IngestaNativa"
         + " , GenoAlimento"
         + " , Estado"
         + " , FechaCreacion"
         + " , FechaModifica"
         + " FROM SOHormiga"
         + " WHERE Estado = 'A'";
        
         try {
            Connection conn = openConnection();     //conectar a BD
            Statement  stmt = conn.createStatement();   //CRUD: Select *
            ResultSet rs = stmt.executeQuery(query);  //ejecutar la
            while (rs.next()) { 
                p = new SOHormigaDTO(rs.getInt(1) 
                                    ,rs.getInt(2)       //TipoHormiga
                                    ,rs.getInt(3)       //Localidad
                                    ,rs.getInt(4)       //Sexo
                                    ,rs.getInt(5)       //IngestaNativa
                                    ,rs.getInt(6)       //GenoAlimento
                                    ,rs.getString(7)    //estado
                                    ,rs.getString(8)    //FechaCrea
                                    ,rs.getString(9)); //FechaModifica/
            }
            
        } catch (SQLException e) {
            throw new PatException(e.getMessage(), getClass().getName(), "readBy()");
        }
        return p;
    }

    @Override
    public boolean create(SOHormigaDTO entity) throws Exception {
        String query = " INSERT INTO SOHormiga (Nombre,Apellido,Correo,IdCatalogoSexo,IdLocalidad) VALUES (?,?,?,?,?)";
        try {
            Connection        conn  = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getNombre());   //
            pstmt.setString(2,  entity.getApellido());
            pstmt.setString(3, entity.getCorreo());
            pstmt.setInt(4, entity.getIdCatalogoSexo());
            pstmt.setInt(5, entity.getIdLocalidad());
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw new PatException(e.getMessage(), getClass().getName(), "create()");
        }
    }

    @Override
    public List<SOHormigaDTO> readAll() throws Exception {
        List <SOHormigaDTO> lts = new ArrayList<>();
        String query = 
        "SELECT IdHormiga"
         + " , TipoHormiga"
         + " , Localidad"
         + " , Sexo"
         + " , IngestaNativa"
         + " , GenoAlimento"
         + " , Estado"
         + " , FechaCreacion"
         + " , FechaModifica"
         + " FROM Hormiga"
         + " WHERE Estado = 'A'";
        try {
            Connection conn = openConnection();     //conectar a BD
            Statement  stmt = conn.createStatement();   //CRUD: Select *
            ResultSet rs = stmt.executeQuery(query);  //ejecutar la
            while (rs.next()) { 
                SOHormigaDTO s = new SOHormigaDTO(  rs.getInt(1) 
                                                ,rs.getInt(2)       //TipoHormiga
                                                ,rs.getInt(3)       //Localidad
                                                ,rs.getInt(4)       //Sexo
                                                ,rs.getInt(5)       //IngestaNativa
                                                ,rs.getInt(6)       //GenoAlimento
                                                ,rs.getString(7)    //estado
                                                ,rs.getString(8)    //FechaCrea
                                                ,rs.getString(9)); //FechaModifica/
                lts.add(s);
            }

        } catch (SQLException e) {
            
            throw new PatException(e.getMessage(), getClass().getName(), "readAll()");
        }
        return lts;
    }

    @Override
    public boolean update(SOHormigaDTO entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
