package com.nt.error;

public class NotFoundException extends RuntimeException{
          public NotFoundException() {

                     }
         public NotFoundException(String msg){
        	 super(msg);
         }

}
