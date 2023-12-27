package exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Data
public class ResponseExceptionDto {
    private int statusCode;
    private Map<String, List<String>> errorResponse;
}
