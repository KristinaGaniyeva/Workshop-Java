package it.sevenbits.exceptions;

/**
 * Class with exception for Triangle
 */
public class TriangleException extends Throwable {
    /**
     * Exception
     * @param message Error message
     */
    public TriangleException(final String message) {
        super(message);
    }
}
