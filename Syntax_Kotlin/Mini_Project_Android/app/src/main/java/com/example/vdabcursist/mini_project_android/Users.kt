package com.example.vdabcursist.mini_project_android

import com.j256.ormlite.dao.Dao
import java.util.*
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable

@DatabaseTable(tableName="Users")
data class Users (
        @DatabaseField(generatedId = true)
        var accountId: Int?=null,

        @DatabaseField
        var firstname: String?=null,

        @DatabaseField
        var lastname: String?=null,

        @DatabaseField
        var address : Date?=null,

        @DatabaseField
        var birthdate : Date?=null
)

class UserDao{
    companion object {
        lateinit var dao: Dao<Users, Int>
    }

    init {
        dao = DBHelper.getDao(Users:: class.java)
    }

    fun add(user: Users) = dao.createOrUpdate(user)
    fun update(user: Users) = dao.update(user)
    fun delete(user: Users) = dao.delete(user)
    fun queryForAll() = dao.queryForAll()
    fun removeAll(){
        for (table in queryForAll()){
            dao.delete(table)
        }
    }
}