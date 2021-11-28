package tugas.thymeleaf.models.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "bus")
public class Bus {
    
    @Id
    @Column(length = 22)
    private String no_polisi;

    @Column(length = 11)
    private int kapasitas;

    private String nama_supir;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nama")
    private String nama_perusahaan;
}
