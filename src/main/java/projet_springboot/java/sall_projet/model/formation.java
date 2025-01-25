package projet_springboot.java.sall_projet.model;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
public class formation {
    


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Nomform;
    private String descriptionform;
    private String etablissement;
    private String pays;
    private String ville;
    private LocalDate dateDebut;
    private LocalDate dateFin;
  
}
