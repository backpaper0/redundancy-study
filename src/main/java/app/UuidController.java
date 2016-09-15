package app;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UuidController {

    final UUID id = UUID.randomUUID();

    @GetMapping
    String get() {
        return id.toString();
    }
}
