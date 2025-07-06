package com.motycka.edu.order

import com.motycka.edu.menu.MenuItemId

data class OrderItemDTO(
    val id: OrderItemId?,
    val orderId: Long,
    val menuItemId: MenuItemId,
    val quantity: Int
)
