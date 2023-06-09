package com.sekhgmainuddin.timeshare.ui.home.chat.backend.adapters.diffutilsmessage

import androidx.recyclerview.widget.DiffUtil
import com.sekhgmainuddin.timeshare.data.db.entities.ChatEntity

class ChatsDiffCallBack : DiffUtil.ItemCallback<ChatEntity>() {
    override fun areItemsTheSame(oldItem: ChatEntity, newItem: ChatEntity): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: ChatEntity, newItem: ChatEntity): Boolean {
        return oldItem.message == newItem.message && oldItem.document == newItem.document
    }

}