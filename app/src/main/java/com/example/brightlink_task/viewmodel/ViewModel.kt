package com.example.brightlink_task.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.brightlink_task.model.Task
import com.example.brightlink_task.repo.TaskRepository

class TaskViewModel(application: Application) : AndroidViewModel(application) {

    private val taskRepository = TaskRepository(application)
    val taskStateFlow get() = taskRepository.taskStateFlow
    val statusLiveData get() = taskRepository.statusLiveData
    val sortByLiveData get() = taskRepository.sortByLiveData

    fun setSortBy(sort: Pair<String, Boolean>) {
        taskRepository.setSortBy(sort)
    }

    fun getTaskList(isAsc: Boolean, sortByName: String) {
        taskRepository.getTaskList(isAsc, sortByName)
    }

    fun insertTask(task: Task) {
        taskRepository.insertTask(task)
    }

    fun searchTaskList(query: String) {
        taskRepository.searchTaskList(query)
    }

    fun deleteTaskUsingId(taskId: String) {
        taskRepository.deleteTaskUsingId(taskId)
    }

    fun updateTask(task: Task) {
        taskRepository.updateTask(task)
    }

//    fun updateTaskPaticularField(taskId: String,title:String,description:String) {
//        taskRepository.updateTaskPaticularField(taskId, title, description)
//    }

//    fun deleteTask(task: Task) {
//        taskRepository.deleteTask(task)
//    }

}