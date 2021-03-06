package training360.guinessapp.recorders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface RecorderRepository extends JpaRepository<Recorder, Long> {

    @Query("select new training360.guinessapp.recorders.RecorderShortDto(r.name,r.dateOfBirth) from Recorder r where r.name LIKE 'B%' or r.name like '%e%' order by r.dateOfBirth DESC ")
    List<RecorderShortDto> findAndSort();

}
