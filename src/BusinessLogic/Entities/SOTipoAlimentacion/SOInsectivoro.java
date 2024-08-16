package BusinessLogic.Entities.SOTipoAlimentacion;

public class SOInsectivoro extends SOIngestaNativa{

    public void soCarnivoro(){
        tipo = "Carnivoro";
        System.out.println("Es un " + tipo);
    }
}
