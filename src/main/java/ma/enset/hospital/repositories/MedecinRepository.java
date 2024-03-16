package ma.enset.hospital.repositories;
import jakarta.transaction.Transactional;
import ma.enset.hospital.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MedecinRepository  extends JpaRepository<Medecin, Long> {
    @Query("select m from Medecin m where m.id = :id")
    Medecin searchMedecin(@Param("id")long id);
    @Transactional
    @Modifying
    @Query("UPDATE Medecin m SET m.id = :name WHERE m.id = :id")
    void updateMedecin(@Param("id") long id, @Param("name") String nom);
    @Transactional
    void deleteMedecinById(long id);
}