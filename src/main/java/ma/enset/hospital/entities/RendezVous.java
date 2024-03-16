package ma.enset.hospital.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class RendezVous {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;

    private StatusRDV status;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Patient patient;
    @ManyToOne()
    private Medecin medecin;

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStatus(StatusRDV status) {
        this.status = status;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public StatusRDV getStatus() {
        return status;
    }

    public Patient getPatient() {
        return patient;
    }

    public Medecin getMedecin() {
        return medecin;
    }

}