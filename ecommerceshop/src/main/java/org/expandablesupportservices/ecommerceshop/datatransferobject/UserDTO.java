package org.expandablesupportservices.ecommerceshop.datatransferobject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties( ignoreUnknown =true)
public class UserDTO {
	

	private Long id;
	private String firstName ;
	private String LastName;
	private String username;
	private String password;
	private String email;
	private String mobileNumber;
	private String creationTimeStamp;
	private UserDetailDTO userDetailDTO;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getCreationTimeStamp() {
		return creationTimeStamp;
	}
	public void setCreationTimeStamp(String creationTimeStamp) {
		this.creationTimeStamp = creationTimeStamp;
	}
	public UserDetailDTO getUserDetailDTO() {
		return userDetailDTO;
	}
	public void setUserDetailDTO(UserDetailDTO userDetailDTO) {
		this.userDetailDTO = userDetailDTO;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", firstName=" + firstName + ", LastName=" + LastName + ", username=" + username
				+ ", password=" + password + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", creationTimeStamp=" + creationTimeStamp + ", userDetailDTO=" + userDetailDTO + "]";
	}
	

	
	
	

}
