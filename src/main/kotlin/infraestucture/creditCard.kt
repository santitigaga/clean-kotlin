package infraestucture

import domain.Interfaces.IPayment
import domain.Shopping

class creditCard:IPayment{
    override fun pay(shopping: Shopping) {
        println("payment  with visa ")
    }

}