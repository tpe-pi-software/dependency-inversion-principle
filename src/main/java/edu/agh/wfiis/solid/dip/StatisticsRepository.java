package edu.agh.wfiis.solid.dip;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;

import java.util.Date;

import static edu.agh.wfiis.solid.dip.StatisticsTable.HASH_KEY_NAME;
import static edu.agh.wfiis.solid.dip.StatisticsTable.RANGE_KEY_NAME;
import static edu.agh.wfiis.solid.dip.StatisticsTable.VALUE;

public class StatisticsRepository {
   public static final String TABLE_NAME = "StatisticsTable";
   private Table table;

   public StatisticsRepository() {
      AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
      DynamoDB dynamoDB = new DynamoDB(client);

      table = dynamoDB.getTable(TABLE_NAME);
   }

   public void add(Statistics statistics) {
      String serialized = serialize(statistics);
      Item item = new Item().withPrimaryKey(HASH_KEY_NAME, statistics.getName(),
            RANGE_KEY_NAME, statistics.getDay()).withString(VALUE, serialized);
      table.putItem(item);
   }

   public Statistics get(String name, Date day) {
      Item item = table.getItem(HASH_KEY_NAME, name,
            RANGE_KEY_NAME, day);
      return deserialize(item.getString(VALUE));
   }

   private String serialize(Statistics statistics) {
      return null;
   }

   private Statistics deserialize(String serialized) {
      return null;
   }
}
