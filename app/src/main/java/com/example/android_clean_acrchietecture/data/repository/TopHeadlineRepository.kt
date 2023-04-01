package com.example.android_clean_acrchietecture.data.repository

import com.example.android_clean_acrchietecture.data.api.NetworkService
import com.example.android_clean_acrchietecture.data.model.Article
import javax.inject.Inject
import javax.inject.Singleton


import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

@Singleton
class TopHeadlineRepository @Inject constructor(private val networkService: NetworkService) {



    fun getTopHeadlines(country: String): Flow<List<Article>> {
        return flow {
            emit(networkService.getTopHeadlines(country))
        }.map {
            it.articles
        }
    }

}