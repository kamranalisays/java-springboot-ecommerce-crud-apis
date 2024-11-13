package org.expandablesupportservices.ecommerceshop.services;

import java.util.List;
import java.util.Optional;

import org.expandablesupportservices.ecommerceshop.datatransferobject.UserDTO;
import org.expandablesupportservices.ecommerceshop.models.Product;
import org.expandablesupportservices.ecommerceshop.models.User;
import org.expandablesupportservices.ecommerceshop.repositories.UserRepositoryI;
import org.expandablesupportservices.ecommerceshop.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepositoryI userRepositoryI;
	
	public ResponseEntity<ApiResponse<List<User>>> getAllUsers()
	{
		List<User> userList =  userRepositoryI.findAll();

		 
		 ApiResponse<List<User>> apiResponse=new ApiResponse<List<User>>( "success", userList  );
		 return ResponseEntity.ok(apiResponse);

	}
	
		
	public ResponseEntity<ApiResponse<UserDTO>> getUserById(Long userId)
	{
		
		 Optional<User> user =  userRepositoryI.findById(userId);
		 UserDTO userDTO=new UserDTO();
		
		 if(user.isPresent())
		 {
		 userDTO.setId(userId);
		 userDTO.setFirstName(user.get().getFirstName());
		 userDTO.setLastName(user.get().getLastName());
		 userDTO.setUsername(user.get().getUsername());
		 userDTO.setPassword(user.get().getPassword());
		 userDTO.setEmail(user.get().getEmail());
		 userDTO.setMobileNumber(user.get().getMobileNumber());
		 userDTO.setCreationTimeStamp(user.get().getCreationDate().toString());

		 } 
		 else
		 {
			 userDTO=null; 
		 }

		 
		 ApiResponse<UserDTO> apiResponse=new ApiResponse<UserDTO>( "success",userDTO  );
		 return ResponseEntity.ok(apiResponse);

	}
	
	
	public ResponseEntity<ApiResponse<UserDTO>> createUser(UserDTO userDTO)
	{
			 User user= convertUserDTOToUser(userDTO);
	
			 user=userRepositoryI.save(user);
			
			 userDTO.setId(user.getId());
		
	
			 ApiResponse<UserDTO> apiResponse=new ApiResponse<UserDTO>( "success",userDTO  );
			 return ResponseEntity.ok(apiResponse);
	}
	
	
	public ResponseEntity<ApiResponse<UserDTO>> updateUser(UserDTO userDTO)
	{
	
		 User user= convertUserDTOToUser(userDTO);
		
	     user =  userRepositoryI.save(user);
		
		
		 ApiResponse<UserDTO> apiResponse=new ApiResponse<UserDTO>( "success",userDTO  );
		 return ResponseEntity.ok(apiResponse);
		
	}
	
	public ResponseEntity<ApiResponse<Long>> deleteUserById(Long userId)
	{
		
		 userRepositoryI.deleteById(userId);
		 

		 ApiResponse<Long> apiResponse=new ApiResponse<Long>( "success",userId  );
		 return ResponseEntity.ok(apiResponse);
		
	}

	private User convertUserDTOToUser(UserDTO userDTO)
	{
		User user=new User();
		
		user.setFirstName(userDTO.getFirstName());
		user.setLastName(userDTO.getLastName());
		user.setEmail(userDTO.getEmail());
		user.setMobileNumber(userDTO.getMobileNumber());
		user.setPassword(userDTO.getPassword());
		user.setUsername(userDTO.getUsername());
		
		return user;
	}
	

	
	private UserDTO convertUserToUserDTO(User user)
	{
		UserDTO userDTO=new UserDTO();
		
		 userDTO.setId(user.getId());
		 userDTO.setFirstName(user.getFirstName());
		 userDTO.setLastName(user.getLastName());
		 userDTO.setUsername(user.getUsername());
		 userDTO.setPassword(user.getPassword());
		 userDTO.setEmail(user.getEmail());
		 userDTO.setMobileNumber(user.getMobileNumber());
		 userDTO.setCreationTimeStamp(user.getCreationDate().toString());
		
		return userDTO;
	}
	
	
	
	
}
