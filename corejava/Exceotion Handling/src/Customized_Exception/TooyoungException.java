package Customized_Exception;

public class TooyoungException extends RuntimeException{
	TooyoungException(String msg){
	super(msg);
}}
class TooOldException extends RuntimeException{
	TooOldException(String msg){
		super(msg);
	
}}
