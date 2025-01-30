package InventoryFlow;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit5.Karate;

@KarateOptions(tags = {"@Regression,E2E"} )
public class TestRunner {

    @Karate.Test
    Karate runTests() {
        new Karate();
         return Karate.run(
                "classpath:InventoryFlow/getItemDetails.feature",
                 "classpath:InventoryFlow/getItemDetailsById.feature",     
                 "classpath:InventoryFlow/addNewItemNonExistingId.feature",           
                "classpath:InventoryFlow/createNewItemWithExistingId.feature",
               "classpath:InventoryFlow/itemCreationWithMissingFields.feature",
			   "classpath:InventoryFlow/recentCreatedItem.feature");

    }
}