package com.study.ocp.day10;

import java.util.Objects;

public class Exam implements Comparable<Exam> {

	private String name;
	private Integer score;

	public Exam() {
	}

	public Exam(String name, Integer score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exam other = (Exam) obj;
		return Objects.equals(name, other.name) && Objects.equals(score, other.score);
	}

	@Override
	public int compareTo(Exam s) {
		int num = this.score - s.getScore();
		if (num != 0) {
			return num;
		} else {
			return this.name.compareTo(s.getName());
		}

	}

	@Override
	public String toString() {
		return "Exam [name = " + name + ", score = " + score + "]";
	}

}
