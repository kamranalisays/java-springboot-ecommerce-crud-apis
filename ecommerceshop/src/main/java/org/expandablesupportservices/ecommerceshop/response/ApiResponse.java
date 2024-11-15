package org.expandablesupportservices.ecommerceshop.response;

public class ApiResponse<T> {
	
	private String message ;
	private T data;
	private long timestamp;
	
	
	    public ApiResponse( String message, T data) {
	
	        this.message = message;
	        this.data = (T) data;
	        this.timestamp = System.currentTimeMillis();
	    }

	    

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public long getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(long timestamp) {
			this.timestamp = timestamp;
		}
	    
	    
	        
	    
	    

}
