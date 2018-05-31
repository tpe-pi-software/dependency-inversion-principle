package edu.agh.wfiis.solid.dip;

import java.io.Serializable;

interface Serializing<T extends Serializable> {
   String serialize(T statistics) throws SerializingException;
   T deserialize(String statistics) throws SerializingException;
}
