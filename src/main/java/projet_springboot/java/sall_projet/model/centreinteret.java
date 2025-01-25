package projet_springboot.java.sall_projet.model;

import java.sql.Date;
import java.time.LocalDate;
import jakarta.persistence;
import lombok.Data;



public class centreinteret {
    

 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private Date description;
  

}
