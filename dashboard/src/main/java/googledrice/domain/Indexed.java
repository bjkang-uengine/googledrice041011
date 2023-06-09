package googledrice.domain;

import googledrice.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class Indexed extends AbstractEvent {

    private Long id;
    private Long fileid;
    private String fileType;
    private List<String> keyword;
}
