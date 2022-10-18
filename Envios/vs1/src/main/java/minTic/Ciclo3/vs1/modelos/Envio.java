package minTic.Ciclo3.vs1.modelos;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Envio {
    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private int idEnvio;

    @ManyToOne
    @JoinColumn(name = "envios_cliente", referencedColumnName = "cedula")
    private Cliente cliente;

    private String tipo_Paquete;
    private float peso;
    private String contenido_declarado;
    private String ciudad_destino;
    private String direccion_entrega;
    private String otras_señales;
    private int cedula_destinatario;
    private String nombre_destinatario;
    private int telefono_destinatario;
    private String estado;
    private Date fecha_envio;
    private Date  fecha_entrega;
}
