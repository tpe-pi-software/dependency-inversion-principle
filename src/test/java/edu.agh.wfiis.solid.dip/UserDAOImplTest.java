package edu.agh.wfiis.solid.dip;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UserDAOImplTest {
   @ClassRule
   public static final LocalDynamoDBCreationRule dynamoDB = new LocalDynamoDBCreationRule();

   @Test
   public void validateDBConnection(){
      DynamoDBMapper mapper = new DynamoDBMapper(dynamoDB.getAmazonDynamoDB());
      CreateTableRequest createTableRequest = mapper.generateCreateTableRequest(StatisticsTable.class);
      createTableRequest.setProvisionedThroughput(new ProvisionedThroughput(5L, 5L));
      dynamoDB.getAmazonDynamoDB().createTable(createTableRequest);
   }
}

