package edu.agh.wfiis.solid.dip;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;


public class JsonSerializer<TYPE_BEING_SERIALIZED extends Serializable>
      implements Serializing<TYPE_BEING_SERIALIZED> {
   @Override
   public String serialize(TYPE_BEING_SERIALIZED objectBeingSerialized) {
      ObjectMapper objectMapper = new ObjectMapper();

      try {
         return objectMapper.writeValueAsString(objectBeingSerialized);
      } catch (JsonProcessingException e) {
         throw new SerializingException(e.getMessage(), e);
      }
   }

   @Override
   public TYPE_BEING_SERIALIZED deserialize(String objectBeingDeserialized) {
      return null;
   }
}
