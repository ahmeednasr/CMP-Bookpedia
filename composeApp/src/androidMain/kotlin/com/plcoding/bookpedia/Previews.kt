package com.plcoding.bookpedia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.domain.books
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreen
import com.plcoding.bookpedia.book.presentation.book_list.BookListState
import com.plcoding.bookpedia.book.presentation.book_list.components.BookListItem
import com.plcoding.bookpedia.book.presentation.book_list.components.BookSearchBar
import com.plcoding.bookpedia.core.presentation.DarkBlue
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
private fun BookSearchBarPreview() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.White))
    BookSearchBar(
        searchQuery = "kotlin",
        onSearchQueryChange = {},
        onImeSearch = {

        },
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    )
}


@Preview
@Composable
private fun BookListItemPreview() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(DarkBlue)
            .padding(16.dp)
    ) {
        BookListItem(
            book = dummyBook,
            onClick = {}
        )
    }
}



@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResults = books
        ),
        onAction = {}
    )
}

val dummyBook = Book(
    id = "1",
    title = "Kotlin Multiplatform in Action",
    imageUrl = "https://configs-web.openlibrary.org/covers/b/id/10523305-L.jpg",
    authors = listOf("Mark Summerfield", "Philipp Lackner"),
    description = "A comprehensive guide to Kotlin Multiplatform development.",
    language = listOf("en"),
    firstPublishYear = "2023",
    averageRating = 4.67,
    ratingsCount = 125,
    numPages = 350,
    numEdition = 2
)
