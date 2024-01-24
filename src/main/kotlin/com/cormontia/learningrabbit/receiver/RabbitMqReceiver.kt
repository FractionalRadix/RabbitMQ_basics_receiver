package com.cormontia.learningrabbit.receiver

import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
class RabbitMqReceiver {
    @RabbitListener(queues = ["test.rabbit.topic1"])
    fun receive(msg: String) {
        println("Received message: $msg")
    }
}