package projet_springboot.java.sall_projet.model;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.Data;



public class qualification {
    
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;

}
