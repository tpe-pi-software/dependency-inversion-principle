package edu.agh.wfiis.solid.dip;

public class SerializingException extends RuntimeException {
   public SerializingException(String message) {
      super(message);
   }

   public SerializingException(String message, Throwable cause) {
      super(message, cause);
   }
}
