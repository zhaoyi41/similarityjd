package com.jt.maventest;

import java.util.HashMap;

import org.junit.Test;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.QueueingConsumer.Delivery;

public class Test_1simple_consumer {
	// 消息的消费者，接收者
	@Test
	public void consumer() throws Exception {
		// 1,创建连接
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("192.168.138.101");
		factory.setPort(5672);
		factory.setVirtualHost("/jt");
		factory.setUsername("jtadmin");
		factory.setPassword("jtadmin");
		// client包
		Connection connection = factory.newConnection();
		// 2,创建通道
		Channel channel = connection.createChannel();
		// 3,创建队列
		String queue = "orderQueue1";
		boolean durable = true;// 把队列保存在硬盘上
		boolean exclusive = false;// 别的项目能访问
		boolean autoDelete = false;
		HashMap<String, Object> arguments = null;
		channel.queueDeclare(queue, durable, exclusive, autoDelete, arguments);
		// 4,读数据

		QueueingConsumer consumer = new QueueingConsumer(channel);
		// 自动确认，消费者收到消息，就自动给消息队列服务器发确认信息
		// 消息队列服务器就会删除信息。
		boolean autoAck = true;
		// 从orderQueue1队列取消息，消息放到consumser
		channel.basicConsume(queue, autoAck, consumer);
		// 完整项目中，有停止功能，当停止程序时，isRunning=false;
		System.out.println("启动了消费者");
		boolean isRunning = true;
		while (isRunning) {
			// 取消息，delivery是个实体类，封装的信息有信息的正文和id(tag)
			Delivery delivery = consumer.nextDelivery();
			// 取消息正文
			byte[] body = delivery.getBody();
			String mString = new String(body);
			System.out.println("消费者收到：" + mString);
		}
	}

}
