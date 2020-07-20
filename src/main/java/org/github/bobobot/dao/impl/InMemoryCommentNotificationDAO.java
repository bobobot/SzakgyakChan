package org.github.bobobot.dao.impl;

import org.github.bobobot.entities.CommentNotification;

import java.util.Optional;

public class InMemoryCommentNotificationDAO extends InMemoryNotificationDAO<CommentNotification> {

	@Override
	public CommentNotification create(CommentNotification notification) {
		notification.setID(memory.size());
		memory.add(notification);
		return notification;
	}

	@Override
	public Optional<CommentNotification> update(CommentNotification notification) {
		Optional<CommentNotification> memoryNotification = memory.stream()
				.filter(n -> n.getID() == notification.getID())
				.findFirst();

		if (memoryNotification.isPresent()) {
			memoryNotification.get().setRead(notification.isRead());
			memoryNotification.get().setReplyContent(notification.getReplyContent());
		}

		return memoryNotification;
	}
}
