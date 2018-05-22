package edu.agh.wfiis.solid.dip;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Getter;
import lombok.Setter;

import javax.management.ValueExp;
import java.util.Date;


@DynamoDBTable(tableName = "StatisticsTable")
@Getter
@Setter
public class StatisticsTable {
   public static final String HASH_KEY_NAME = "name";
   public static final String RANGE_KEY_NAME = "day";
   public static final String VALUE = "serializedObject";

   @DynamoDBHashKey(attributeName = HASH_KEY_NAME)
   private String name;

   @DynamoDBRangeKey(attributeName = RANGE_KEY_NAME)
   private Date day;

   @DynamoDBAttribute(attributeName = VALUE)
   private String serializedObject;
}
