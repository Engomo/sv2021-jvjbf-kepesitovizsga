package training360.guinessapp.recorders;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/recorders")
public class RecorderController {

    private RecorderService service;

    public RecorderController(RecorderService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RecorderDto createRecorder(@Valid @RequestBody RecorderCreateCommand command) {
        return service.createRecorder(command);
    }

    @GetMapping
    public List<RecorderShortDto> getRecorders() {
        return service.getRecorders();
    }
}
