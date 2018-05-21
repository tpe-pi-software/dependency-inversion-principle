package edu.agh.wfiis.solid.dip;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Getter;
import lombok.Setter;

@DynamoDBTable(tableName = "edu.agh.wfiis.solid.dip.Statistic")
@Getter
@Setter
public class Statistic {
   @DynamoDBHashKey(attributeName = "name")
   private String name;

   @DynamoDBRangeKey(attributeName = "value")
   private int value;
}
