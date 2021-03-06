package com.example.vdabcursist.mini_project_android

import com.j256.ormlite.dao.Dao
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
        var address : String?=null,

        @DatabaseField
        var birthdate : String?=null,

        @DatabaseField
        var username : String?=null,

        @DatabaseField
        var password : String?=null
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
    fun getUsername(y:String) : String? {
        var usr :MutableList<Users>
        usr = dao.queryForEq("username", y)
        if(usr.size>0){
        return usr.get(0).username
        }
        else return null
    }
    fun getPassword(y:String) : String? {
        var pw :MutableList<Users>
        pw = dao.queryForEq("password", y)
        if(pw.size>0){
            return pw.get(0).password
        }
        else return null
    }


    fun removeAll(){
        for (table in queryForAll()){
            dao.delete(table)
        }
    }
}