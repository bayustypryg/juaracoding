package tugas.thymeleaf.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "penumpang")
@Data
public class Penumpang {
    
    @Id
    @Column(length = 16)
    private String nik;

    private String nama;
    private String telepon;
}
