package ru.oxicom.api.idgeneration.data

interface IdGeneratorRepository {

    fun generateId(): String // вызывает сервис генерации уникального ID

}