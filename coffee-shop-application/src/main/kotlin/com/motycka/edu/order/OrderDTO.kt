package com.motycka.edu.order


data class OrderDTO(
    val id: Long?,
    val customerId: Long,
    val orderItems: List<OrderItemDTO>,
    val totalPrice: Double,
    val status: OrderStatus,
    val isPaid: Boolean
)

enum class OrderStatus {
    PENDING,
    PAID,
    COMPLETED,
    CANCELLED
}
