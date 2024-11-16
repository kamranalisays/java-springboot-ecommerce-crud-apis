package org.expandablesupportservices.ecommerceshop.models;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name= "userId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	
	@Column(name="firstName" , nullable = false  )
	private String firstName ;
	
	@Column(name="lastName" )
	private String LastName;
	
	
	@Column(name="username" , unique= true , nullable = false )
	private String username;
	
	@Column(name="password", nullable =false)
	private String password;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mobileNumber" , unique = true)
	private String mobileNumber;
	
	@CreationTimestamp
	@Column(name="creationDate" , nullable =false ,  updatable = false)
	private LocalDateTime creationDate ;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userDetailId")
	private UserDetail userDetail;
	
	@OneToMany(  cascade = {CascadeType.PERSIST , CascadeType.MERGE , 
			CascadeType.REFRESH, CascadeType.DETACH})
	@JoinColumn(name = "customer_id")
	private List<Order> orderList;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	
	


	
	
}
