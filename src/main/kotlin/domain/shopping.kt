package domain
//DIRTY
class Shopping{
    var db = DbConnectionOracle()
    var creditCard = creditCard()
    fun  sell( ){

         creditCard.pay(this)
        db.save(this)
    }
}

fun main() {
    var _sh = Shopping()
    _sh.sell()
}