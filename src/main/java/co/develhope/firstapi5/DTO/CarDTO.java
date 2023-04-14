package co.develhope.firstapi5.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class CarDTO {
    @NotNull(message="Mandatory!")
    private String id;
    @NotNull (message="Mandatory!")
    private String modelName;
    private double price;
}
