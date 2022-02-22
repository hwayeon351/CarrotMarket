package com.example.carrotmarket.chatlist

data class ChatListItem(
    val buyerId: String,
    val sellerId: String,
    val key: Long,
    val itemTitle: String
) {
    constructor(): this("", "", 0, "")
}
