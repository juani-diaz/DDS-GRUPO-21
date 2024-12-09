package domain.colaboraciones;

import domain.persona.PersonaFisica;
import domain.registro.SingletonSeguidorEstadistica;
import domain.rol.Colaborador;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
public class DonacionDinero extends Colaboracion {

    //@Column No se persiste por que es public, si fuera privado se persistiria
    public final static Float multiplicador = 0.5F;
    @Column
    private Float monto;
    @Column
    private String frecuencia;
    @ManyToOne
    private MedioDePago medioDePago;

    public DonacionDinero(Colaborador colaborador, LocalDate fecha,
                          Float monto, String frecuencia){
        this.colaborador = colaborador;
        this.fecha = fecha;
        this.monto = monto;
        this.frecuencia = frecuencia;
    }

    public void ejecutar(){
        /*Crea un donacionDinero?? que hace esto??
        No es necesario que realice nada, solo tiene que quedar sentada la donacion
        para asi cuando queremos calcular los puntos funciones todo bien */

    }

    public Float puntosObtenidos(){
        return multiplicador *monto ;

    }
}
