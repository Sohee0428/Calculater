package com.example.aop_part2_chapter04.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.aop_part2_chapter04.model.History

@Dao
interface HistoryDao {

    @Query("SELECT * FROM history")
    fun getAll(): List<History>
//    모든 정보 조회

    @Insert
    fun insertHistory(history: History)
//    하나하나 저장하기

    @Query("DELETE FROM history")
    fun deleteAll()
//    전체 삭제

//    @Delete
//    fun delete(history: History)
//    하나만 삭제
//
//    @Query("SELECT * FROM history WHERE result LIKE :result LIMIT 1")
//    fun findByResult(result: String): History
//    조건에 따른 정보를 지우고 싶을 경우 하나만 조회
}