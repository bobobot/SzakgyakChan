package org.github.bobobot.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class CommentNotification extends Notification {

	String replyContent;

	public CommentNotification(int ID, boolean read, User user, String replyContent) {
		super(ID, read, user);
		this.replyContent = replyContent;
	}
}
