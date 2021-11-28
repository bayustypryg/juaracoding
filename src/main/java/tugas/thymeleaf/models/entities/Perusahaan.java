package tugas.thymeleaf.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "perusahaan")
public class Perusahaan{
  
    @Id
    @Column(name = "nama", length = 150)
    private String nama;
    
    @Column(name = "alamat", length = 500)
    private String alamat;


}
