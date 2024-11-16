package org.expandablesupportservices.ecommerceshop.datatransferobject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties( ignoreUnknown =true)
public class UserDetailDTO {
	
	
	private Long id;
	private String dateOfBirth;
	private String profilePictureUrl;
	private String city;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getProfilePictureUrl() {
		return profilePictureUrl;
	}
	public void setProfilePictureUrl(String profilePictureUrl) {
		this.profilePictureUrl = profilePictureUrl;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "UserDetailDTO [id=" + id + ", dateOfBirth=" + dateOfBirth + ", profilePictureUrl=" + profilePictureUrl
				+ ", city=" + city + "]";
	}
	
	
	
	

}
