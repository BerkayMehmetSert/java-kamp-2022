package kodlama.io.rentacar;

import kodlama.io.rentacar.core.exceptions.BusinessException;
import kodlama.io.rentacar.core.exceptions.ProblemDetails;
import kodlama.io.rentacar.core.exceptions.ValidationProblemDetails;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@SpringBootApplication
@RestControllerAdvice
public class RentACarApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentACarApplication.class, args);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ProblemDetails handleBusinessException(BusinessException exception) {
        ProblemDetails problemDetails = new ProblemDetails();
        problemDetails.setMessage(exception.getMessage());

        return problemDetails;
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ProblemDetails handleValidationException(MethodArgumentNotValidException exception) {
        ValidationProblemDetails validationProblemDetails = new ValidationProblemDetails();

        validationProblemDetails.setMessage("Validation exception");
        validationProblemDetails.setValidationErrors(new HashMap<String, String>());

        for(FieldError fieldError : exception.getBindingResult().getFieldErrors()) {
            validationProblemDetails.getValidationErrors()
                    .put(fieldError.getField(), fieldError.getDefaultMessage());
        }

        return validationProblemDetails;
    }

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
