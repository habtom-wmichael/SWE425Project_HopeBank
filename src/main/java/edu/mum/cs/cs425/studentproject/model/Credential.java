package edu.mum.cs.cs425.studentproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Credential {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long credentialId;
}
