package training360.guinessapp.recorders;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class RecorderService {

    private RecorderRepository repository;
    private ModelMapper modelMapper;


    public List<RecorderShortDto> getRecorders() {
        return repository.findAndSort();
    }

    public RecorderDto createRecorder(RecorderCreateCommand command) {
        Recorder recorder = new Recorder(command.getName(), command.getDateOfBirth());
        repository.save(recorder);
        return modelMapper.map(recorder, RecorderDto.class);
    }

    public Recorder getRecorderByID(long id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Recorder not found", "Recorder not found with id: " + id));
    }
}
