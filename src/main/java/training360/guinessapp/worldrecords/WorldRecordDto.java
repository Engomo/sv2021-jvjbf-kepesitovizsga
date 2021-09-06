package training360.guinessapp.worldrecords;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import training360.guinessapp.recorders.RecorderDto;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorldRecordDto {

    private long id;

    private String description;

    private double value;

    private String unitOfMeasure;

    private LocalDate dateOfRecord;

    private String recorderName;

}
