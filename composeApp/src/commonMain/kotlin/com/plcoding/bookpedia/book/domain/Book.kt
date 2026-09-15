package com.plcoding.bookpedia.book.domain

data class Book(
    val id: String,
    val title: String,
    val imageUrl: String,
    val author: String,
    val description: String?,
    val language: List<String>,
    val firstPublishYear: String?,
    val averageRating: Double?,
    val ratingsCount: Int?,
    val numPages: Int?,
    val numEdition: Int?,
)
