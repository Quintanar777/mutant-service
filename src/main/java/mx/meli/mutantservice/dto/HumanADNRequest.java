package mx.meli.mutantservice.dto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
public class HumanADNRequest implements Serializable {
    @NotNull
    private List<String> adn;
}
