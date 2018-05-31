package edu.agh.wfiis.solid.dip;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.Serializable;

@RunWith(JUnit4.class)
public class JsonSerializerTest {

   @Before
   public void setUp(){

   }

   @Test
   public void validateThatSerializeReturnJsonString(){
      Serializable objectToSerialize = new GenericSerializableClass("name", 5);
   }

   private static class GenericSerializableClass implements Serializable {
      private String name;
      private int age;

      public GenericSerializableClass(String name, int age) {
         this.name = name;
         this.age = age;
      }
   }
}

