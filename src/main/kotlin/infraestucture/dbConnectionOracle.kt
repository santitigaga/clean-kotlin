package infraestucture

import domain.Interfaces.IPersistence
import domain.Shopping

class DbConnectionOracle: IPersistence{
    override fun save(shopping: Shopping) {
        println("persistence with Oracle");
    }


}