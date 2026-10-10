package com.plcoding.bookpedia.book.domain

data class Book(
    val id: String,
    val title: String,
    val imageUrl: String,
    val authors: List<String>,
    val description: String?,
    val language: List<String>,
    val firstPublishYear: String?,
    val averageRating: Double?,
    val ratingsCount: Int?,
    val numPages: Int?,
    val numEdition: Int?,
)

val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://test.com",
        authors = listOf("Philipp Lackner"),
        description = "Description $it",
        language = emptyList(),
        firstPublishYear = null,
        averageRating = 4.5678,
        ratingsCount = 5,
        numPages = 100,
        numEdition = 3
    )
}