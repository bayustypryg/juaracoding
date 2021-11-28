package tugas.thymeleaf.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "keberangkatan")
public class Keberangkatan {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int harga;
    private String kelas;
    
    private String tanggal;
    private long id_jurusan;
    private String no_polisi;
    
}
