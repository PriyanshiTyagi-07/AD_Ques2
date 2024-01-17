class player_class{
void details(){
System.out.println("player_class");
}
}
class cricket_player extends player_class{
void fun1(){
System.out.println("Cricket game has 11 players in each team");
}
}
class football_player extends player_class{
void fun2(){
	System.out.println("Football game has 11 players in each team");
}
}
class hockey_player extends player_class{
	void fun3(){
	System.out.println("hockey game has 11 players in each team");
}
}
public class Player
{
public static void main(String[] args){
cricket_player n1=new cricket_player();
football_player n2=new football_player();
n1.details();
n1.fun1();
}
}
