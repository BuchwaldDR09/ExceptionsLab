
package lab3;


public class IllegalNamingError extends IllegalArgumentException {
    private static final String NAMING_ERROR_MESSAGE = "A First and Last name MUST be provided!!";

    public IllegalNamingError() {
        super(NAMING_ERROR_MESSAGE);
    }

    public IllegalNamingError(String s) {
        super(NAMING_ERROR_MESSAGE);
    }
      public IllegalNamingError(String s, Throwable cause) {
        super(NAMING_ERROR_MESSAGE, cause);
    }

    public IllegalNamingError(Throwable cause) {
        super(cause);
    }
  
}
