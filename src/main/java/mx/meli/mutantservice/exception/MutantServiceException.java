package mx.meli.mutantservice.exception;

public class MutantServiceException extends Exception {
    public MutantServiceException(String message) {
        super(message);
    }

    public MutantServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public MutantServiceException(Throwable cause) {
        super(cause);
    }
}
