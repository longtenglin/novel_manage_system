package hkpf.fnb.config;

import com.longlin.novel.exception.MissingParamsException;
import com.longlin.novel.exception.NMSException;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.Ordered;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private MessageSource messageSource;
	
    private static final class ErrorInfo {
        private String error;
        private String message;
        private String code;
        private String field;
        private String issue;
        private String correct;
        
        public String getError() {
			return error;
		}

		public void setError(String error) {
			this.error = error;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
		
		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getField() {
			return field;
		}

		public void setField(String field) {
			this.field = field;
		}

		public String getIssue() {
			return issue;
		}

		public void setIssue(String issue) {
			this.issue = issue;
		}

		public String getCorrect() {
			return correct;
		}

		public void setCorrect(String correct) {
			this.correct = correct;
		}

		public ErrorInfo(String error, String code, String message) {
            this.error = error;
            this.code = code;
            this.message = message;
        }
		
		public ErrorInfo(String error, String code, String message, String field, String issue, String correct) {
            this.error = error;
            this.code = code;
            this.message = message;
            this.field = field;
            this.issue = issue;
            this.correct = correct;
        }
    }
    
    @ExceptionHandler(NMSException.class)
    protected ResponseEntity<ErrorInfo> handleApiException(NMSException ex, Locale locale) {
    	logger.error("FNB Exception", ex);
    	String errorMessage = messageSource.getMessage(ex.getMessage(), null, locale);
        return new ResponseEntity<>(new ErrorInfo("LTL Exception", ex.getCode(), errorMessage), HttpStatus.INTERNAL_SERVER_ERROR);
    }

	@ExceptionHandler(MissingParamsException.class)
	protected ResponseEntity<ErrorInfo> handleMissingParamsException(MissingParamsException exception, Locale locale) {
		logger.error("Missing Required Params Exception", exception);
		String errorMessage = messageSource.getMessage(exception.getMessage(), new Object[] {exception.correct}, locale);
		return new ResponseEntity<>(new ErrorInfo("Missing Required Params Exception", exception.getCode(), errorMessage), HttpStatus.BAD_REQUEST);
	}

}
