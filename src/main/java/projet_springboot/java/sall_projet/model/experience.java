package projet_springboot.java.sall_projet.model;

import java.sql.Date;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.Data;



public class experience {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String entreprise;
    private Date datedebut;
    private Date datefin;
    private String posteoccupe;
    private String descriptionmission;
}

