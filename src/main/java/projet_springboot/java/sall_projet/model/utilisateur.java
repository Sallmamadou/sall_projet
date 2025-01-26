package projet_springboot.java.sall_projet.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String prenom;
    private String nom;
    private String address;
    private String email;
    private String photo;  
    private LocalDate datenaissance;
    private String phone;
    private String genre;
    private String nationalité;
    private String matrimoniale;
    private String description;
}
