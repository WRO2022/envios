package minTic.Ciclo3.vs1.modelos;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Cliente {

    @Id
    private int cedula;

    private int telefono_cliente;

    private String direccion_cliente;

}
