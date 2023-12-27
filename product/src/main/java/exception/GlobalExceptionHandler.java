package exception;

import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.support.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseExceptionDto> handleValidationError(org.springframework.web.bind.MethodArgumentNotValidException exception) {
        List<String> errors = exception.getFieldErrors().stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.toList());
                return getResponseEntityWithErrors(errors, HttpStatus.BAD_REQUEST);
    }

    private ResponseEntity<ResponseExceptionDto> getResponseEntityWithErrors(List<String> errors, HttpStatus httpStatus) {
        Map<String, List<String>> errorResponse = new HashMap<>();
        errorResponse.put("errors", errors);

        return new ResponseEntity<>(new ResponseExceptionDto(httpStatus.value(), errorResponse), new HttpHeaders(), httpStatus);
    }
}
