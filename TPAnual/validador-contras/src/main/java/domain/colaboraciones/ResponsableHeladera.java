package domain.colaboraciones;

import domain.heladera.Heladera;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ResponsableHeladera extends Colaboracion{
    private Heladera heladera;

    public void ejecutar(){
        //TODO
    }
}
