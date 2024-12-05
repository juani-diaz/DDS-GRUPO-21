package domain.suscripcion;

import domain.heladera.Heladera;
import domain.persona.MedioDeContacto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter @Setter
public class PocasViandas extends Suscripcion{

  @Column
  private Integer numeroMinimo;

  public PocasViandas(Heladera heladera, MedioDeContacto notificadores, Integer numeroMinimo){
    this.heladera=heladera;
    this.notificadores=notificadores;
    this.numeroMinimo = numeroMinimo;
    header="Notificacion por suscripcion";
    this.mensaje="Quedan únicamente "+numeroMinimo+" viandas disponibles en la heladera";
  }
}
