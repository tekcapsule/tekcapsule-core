package in.tekcapsule.core.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Builder
public class ExecBy {
    private String tenantId;
    private String userId;

}
