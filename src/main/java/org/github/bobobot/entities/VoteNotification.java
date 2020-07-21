package org.github.bobobot.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import java.util.Objects;

@Entity
@Data
public class VoteNotification extends Notification {
	@Enumerated
	VoteType voteType;

	public VoteNotification(int ID, boolean read, User user, VoteType voteType) {
		super(ID, read, user);
		this.voteType = voteType;
	}

	public enum VoteType {
		UPVOTE, DOWNVOTE
	}
}
