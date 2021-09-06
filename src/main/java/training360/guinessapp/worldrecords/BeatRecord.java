package training360.guinessapp.worldrecords;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import training360.guinessapp.recorders.Recorder;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeatRecord {

    private String description;
    private String unitOfMeasure;
    private Recorder oldRecorder;
    private double oldRecordValue;
    private Recorder newRecorder;
    private double newRecordValue;
    private double recordDifference;

    public BeatRecord(WorldRecord worldRecord, Recorder newRecorder, double newRecordValue) {
        description = worldRecord.getDescription();
        unitOfMeasure = worldRecord.getUnitOfMeasure();
        oldRecorder = worldRecord.getRecorder();
        oldRecordValue = worldRecord.getValue();
        this.newRecorder = newRecorder;
        this.newRecordValue = newRecordValue;
        recordDifference = newRecordValue - oldRecordValue;
    }
}