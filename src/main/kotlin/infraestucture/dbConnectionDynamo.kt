package infraestucture

import domain.Interfaces.IPersistence
import domain.Shopping

class DbConnectionDynamo: IPersistence{
    override fun save(shopping: Shopping) {
        println("persistence with Dynamo");
    }


}