package com.anabatic.itAssets.persistence.model;

import java.util.Date;
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
@Table(name = "candidateRecord")
public class CandidateRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	public Integer getSteps() {
		return steps;
	}

	public void setSteps(Integer steps) {
		this.steps = steps;
	}

	@Column(name = "steps")
	private Integer steps;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "r_id")
	private Users rUserId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "hm_id")
	private Users hmUserId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "c_id")
	private Candidate cId;
	
	@Column(name = "comments")
	private String comment;


	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Candidate getcId() {
		return cId;
	}

	public void setcId(Candidate cId) {
		this.cId = cId;
	}

	public Users getrUserId() {
		return rUserId;
	}

	public void setrUserId(Users rUserId) {
		this.rUserId = rUserId;
	}

	public Users getHmUserId() {
		return hmUserId;
	}

	public void setHmUserId(Users hmUserId) {
		this.hmUserId = hmUserId;
	}

	@Column(name = "status")
	private Integer status;

	@Column(name = "data")
	private String data;

	@Column(name = "date")
	private Date date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
