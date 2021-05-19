package com.example.appBack.Student.Entity;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "tipoRegistro")
public class Tiporegistro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estudiantes_seq")
    @GenericGenerator(
            name = "estudiantes_seq",
            strategy = "com.example.appBack.Student.Entity.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "EST"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%08d")
            })
    @NotNull
    private String id_tipoRegistro;

    @Column(unique = true)
    @NotNull
    private String name;

    @NotNull
    private Date last_update;

    @NotNull
    private boolean activo;

    public List<Note> nota;

    public Tiporegistro(TiporegistroDTO tiporegistroDTO){
        //id null
        Date fecha=new Date();
        this.name="";
        this.last_update=fecha;
        this.activo=true;

        this.setDatos(tiporegistroDTO);
    }

    public void setDatos(TiporegistroDTO tiporegistroDTO){
        //id null
        this.setName(tiporegistroDTO.getName());
        this.setLast_update(tiporegistroDTO.getLast_update());
        this.setActivo(tiporegistroDTO.isActivo());
    }

    private void setName(String nombre) {
        if(comprobarString(nombre))
        {
            this.name = nombre;
        }
    }

    private void setLast_update(Date fecha) {
        if(comprobarFechas(fecha)){
            this.last_update = fecha;
        }
    }

    private void setActivo(boolean activo){
        this.activo=activo;
    }

    private boolean comprobarString(String str)
    {
        try {
            if (str.trim().length() != 0 && str != null)
            {
                return true;
            }
        }catch (Exception e) { }
        return false;
    }

    private boolean comprobarFechas(Date fecha)
    {
        try {
            if (fecha != null) {
                return true;
            }

        }catch(Exception e){e.printStackTrace();}
        return false;
    }

    private boolean comprobarNumbers(Object num)
    {
        try
        {
            if(num != null && Double.parseDouble(num.toString()) > 0)
            {
                return true;
            }
        }
        catch (NumberFormatException e){}
        return false;
    }

    private boolean comprobarObjects(Object objeto)
    {
        try {
            if (objeto != null) {
                return true;
            }
        }catch(Exception e){ }
        return false;
    }

}
