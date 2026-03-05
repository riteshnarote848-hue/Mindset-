package com.ritesh.mindrise.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

/**
 * Entity representing a Habit in the database
 */
@Entity(tableName = "habits")
data class HabitEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val category: String,
    val reminderTime: String? = null,
    val createdAt: Long = System.currentTimeMillis(),
    val color: Int = 0xFF6B4CE6.toInt(),
    val icon: String = "🎯"
)