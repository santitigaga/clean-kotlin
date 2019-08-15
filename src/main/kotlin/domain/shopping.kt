package domain

import domain.Interfaces.IPayment
import domain.Interfaces.IPersistence
import infraestucture.DbConnectionDynamo
import infraestucture.DbConnectionOracle
import infraestucture.creditCard

//CLEAN
class Shopping{

    var payment:IPayment
    var persistence:IPersistence


    constructor(payment:IPayment,persistence: IPersistence){
        this.payment = payment
        this.persistence = persistence
    }
    fun  sell( ){

         payment.pay(this)
        persistence.save(this)
    }
}

fun main() {
    var _sh = Shopping(creditCard(), DbConnectionOracle())
    _sh.sell()

    _sh = Shopping(creditCard(), DbConnectionDynamo())
    _sh.sell()
}