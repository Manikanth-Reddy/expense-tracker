package com.mani.expensetracker.model;

import java.math.BigDecimal;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "expenses")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "description")
	private String expenses;
	private BigDecimal amount;
	private String note;
	private Long created_at;
}
