import java.util.Scanner;

public class Owners{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

String prompt = """
welome Nokia
press
1 -> for menu
2 -> for back
""";



String Menu = """
welcome to nokia
press

1 -> Phone book
2 -> Message
3 -> Chat
4 -> Call register
5 -> Tones
6 -> Settings
7 -> Call divert
8 -> Games
9 -> Calculator
10 -> Reminder
11 -> Clock
12 -> Profiles
13 -> Sim services

""";

String J = """
1 -> Search
2 -> Service Nos
3 -> Add name
4 -> Erase
5 -> Edit
6 -> Assign tone
7 -> Send b'card
8 -> Options
  1. type of view
  2. memory status
9 -> speed dials
10 -> voice tags

""";


String M = """

1 -> write messages
2 -> inbox
3 -> outbox
4 -> picture message
5 -> templates
6 -> smileys
7 -> message settings 
 1.set
   1. message center number
   2. message sent as
   3. message validity
 2.common
   1. delivery reports
   2. reply via same center
   3. character support
8 -> info service
9 -> voice mailbox number
10 -> service commanand editor

""";

String C = """
1 -> missed calls
2 -> received calls
3 -> dialled numbers
4 -> erase recent call lists
5 -> show call duration
  1. last call duration
  2. all calls duration
  3. received calls duration
  4. dialled calls duration
  5. clear timers
6 -> show call costs
  1.last call cost
  2.all calls cost
  3. clear counter
7 -> call cost settings
  1. call cost limit
  2. show costs in
8. prepaid credit

""";

 String T= """
1 -> ringing tone
2 -> ringing volume
3 -> incoming call alert
4 -> composer
5 -> message alert tone
6 -> keypad tones
7 -> warning and games tones
8 -> vibrating alert
9 -> screen saver

""";

 String S = """

1 -> call settings
   1. automatic redial
   2. speed dialling 
   3. call waiting options
   4. own number sending
   5. phone line in use
   6. automatic answer
2-> phone settings
   1. language 
   2. call info display
   3. welcome note
   4. network selection
   5. lights
   6. confirm sim service actions
3 -> security settings
   1. pin code request
   2. call barring service
   3. fixed dialling
   4. closed user group
   5. phone security
   6. change access codes
4 -> restore factory settings

""";

 String CL = """

1 -> alarm clock
2 -> clock settings
3 -> date setting
4 -> stopwatch
5 -> countdown timer
6 -> auto update of date and time

""";




System.out.println(prompt);
int prompt = input.nextInt();

switch(prompt){

case 1-> 
System.out.println(Menu);
int Menu = input.nextInt();

switch(Menu){
case 1->
 System.out.println(" 1. Search\n 2.Service Nos\n 3. Add name\n 4. Erase\n 5. Edit\n 6. Assign tone\n 7. send b'card\n 8. options 9. speed dials\n 10. voice tags\n");}
}

}
}