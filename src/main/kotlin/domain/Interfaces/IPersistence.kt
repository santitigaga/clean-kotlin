package domain.Interfaces

import domain.Shopping

interface IPersistence{
    fun save(shopping: Shopping)

}