package BusinessLogic;

import java.util.List;

import DataAccess.DTO.SOHormigaDTO;

public class SOHormigaBL {
    private SOHormigaDTO persona;
    private SOHormigaDAO pDAO = new SOHormigaDAO();

    public SOHormigaBL(){}

    public List<SOHormigaDTO> getAll() throws Exception{
        List<SOHormigaDTO> lst = pDAO.readAll();
        for (SOHormigaDTO hormigaDTO : lst) 
            hormigaDTO.setNombre(hormigaDTO.getNombre().toUpperCase());
        return lst;
    }
    public SOHormigaDTO getBy(int idPersona) throws Exception{
        persona = pDAO.readBy(idPersona);
        return persona;
    }
    public boolean add(SOHormigaDTO hormigaDTO) throws Exception{   
        return pDAO.create(hormigaDTO);
    }
    public boolean update(SOHormigaDTO hormigaDTO) throws Exception{
        return pDAO.update(hormigaDTO);
    }
    public boolean delete(int idPersona) throws Exception{
        return pDAO.delete(idPersona);
    }
    public Integer getRowCount() throws Exception{
        return pDAO.getRowCount();
    }

}
