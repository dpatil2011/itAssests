package com.anabatic.itAssets.persistence.model;

import java.util.Date;

import javax.persistence.CascadeType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "question")
	private String question;

	@Column(name = "questionTo")
	private String questionTo;

	@Column(name = "answer")
	private String answer;
	
	@Column(name = "requested_date")
	private Date dor;

	@Column(name = "closing_date")
	private Date cod;

	public Date getDor() {
		return dor;
	}

	public void setDor(Date dor) {
		this.dor = dor;
	}

	public Date getCod() {
		return cod;
	}

	public void setCod(Date cod) {
		this.cod = cod;
	}

	@Column(name = "status")
	private Integer status;

	@Column(name = "identifier")
	private Integer identifier;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userId", referencedColumnName = "id")
	private Users userId;

	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "repliedBy", referencedColumnName = "id")
	private Users repliedBy;

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

	public Users getUserId() {
		return userId;
	}

	public void setUserId(Users userId) {
		this.userId = userId;
	}

	public Users getRepliedBy() {
		return repliedBy;
	}

	public void setRepliedBy(Users repliedBy) {
		this.repliedBy = repliedBy;
	}

	public String getQuestionTo() {
		return questionTo;
	}

	public void setQuestionTo(String questionTo) {
		this.questionTo = questionTo;
	}

}
