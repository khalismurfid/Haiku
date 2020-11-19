package id.ac.ui.cs.mobileprogramming.khalismurfid.haiku.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.ui.cs.mobileprogramming.khalismurfid.haiku.database.entity.Poem

@Dao
interface PoemDao{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertPoems(poems: Poem) : Long

    @Update
    suspend fun updatePoems(poems: Poem) : Int

    @Delete
    suspend fun deletePoems(poems: Poem) : Int

    @Query("SELECT * FROM POEM")
    fun loadAllPoems(): LiveData<Array<Poem>>
}