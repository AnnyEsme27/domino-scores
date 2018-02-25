package Modelos;
// Generated 25/02/2018 01:34:48 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Partidas generated by hbm2java
 */
public class Partidas  implements java.io.Serializable {


     private int id;
     private Date fecha;
     private int puntajeMax;
     private Set rondases = new HashSet(0);
     private Set participanteses = new HashSet(0);

    public Partidas() {
    }
    public Partidas(int puntajeMax) {
        this.fecha = new Date();
        this.puntajeMax = puntajeMax;
    }	
    public Partidas(Date fecha, int puntajeMax) {
        this.fecha = fecha;
        this.puntajeMax = puntajeMax;
    }
    public Partidas(Date fecha, int puntajeMax, Set rondases, Set participanteses) {
       this.fecha = fecha;
       this.puntajeMax = puntajeMax;
       this.rondases = rondases;
       this.participanteses = participanteses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getPuntajeMax() {
        return this.puntajeMax;
    }
    
    public void setPuntajeMax(int puntajeMax) {
        this.puntajeMax = puntajeMax;
    }
    public Set getRondases() {
        return this.rondases;
    }
    
    public void setRondases(Set rondases) {
        this.rondases = rondases;
    }
    public Set getParticipanteses() {
        return this.participanteses;
    }
    
    public void setParticipanteses(Set participanteses) {
        this.participanteses = participanteses;
    }




}


