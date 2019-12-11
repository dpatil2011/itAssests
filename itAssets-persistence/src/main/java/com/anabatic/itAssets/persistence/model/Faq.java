package com.anabatic.itAssets.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "faq")
public class Faq {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "question")
	private String question;

	@Column(name = "answer")
	private String answer;

	@Column(name = "status")
	private Integer status;

	@Column(name = "identifier")
	private Integer identifier;

//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "userId")
//	private Assets userId;
//
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "reqpliedBy")
//	private Assets repliedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Integer identifier) {
		this.identifier = identifier;
	}

//	public Assets getUserId() {
//		return userId;
//	}
//
//	public void setUserId(Assets userId) {
//		this.userId = userId;
//	}
//
//	public Assets getRepliedBy() {
//		return repliedBy;
//	}
//
//	public void setRepliedBy(Assets repliedBy) {
//		this.repliedBy = repliedBy;
//	}

}
