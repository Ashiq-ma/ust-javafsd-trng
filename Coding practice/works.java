import java.util.*;


public class User{

	private int id;
	private String username;
	private String password;


User(int id,String username,String password)
{
this.id=id;
this.username=username;
this.password=password;
}
public int getId(){
return this.id;
}
String setid(){
this.id=id;
}
public void getUsername(){
return this.username;
}
String setUsername(){
this.username=username;
}
public void getPassword(String password1){
return this.password;
}
String setPassword(){
this.password=password;
}
}
class UserBo{
public User[] getUser(){
User[] obj=new User[]{new User(1,"Louis","rxfsuzA2345"),new User(2,"Messie","hpphmf1")};
return obj;
}
private String encryptPassword(String password){
String Enc="";
int ascii;
for(char c:password.toCharArray()){
ascii=(int)c;
ascii++;
c=(char)ascii;
Enc=Enc+c;
}
return Enc;
}
boolean validate(String username,String password){
User[] u=getUsers();
int flag=0;
String Enp=encryptPassword(password);
for(int i=0;i<u.length;i++){
if(username.equals(u[i].getUsername())){
if(Enp.equals(u[i].getPassword())){
flag=1;
}
}
}
if(flag==1)
return true;
else
return false;
}
}
class Coding1{
public static void main(String args[]){
String uname,pass;
Scanner sc=new Scanner(System.in);
System.out.println("Username");
uname=sc.nextLine();
System.out.println("Password:");
pass=sc.nextLine();

UserBo ub=new UserBo();
boolean result=ub.validate(uname,pass);
if(result==true){
System.out.println("Login successfull");
}
else
{
System.out.println("Incorrect username/password");
}
}
}




