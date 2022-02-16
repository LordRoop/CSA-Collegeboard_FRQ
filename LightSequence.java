public class LightSequence

{

// attributes not shown

 

/** The parameter seq is the initial sequence used for

* the light display

*/

public LightSequence(String seq)

{ /* implementation not shown */ 
LightSequence gradShow = new LightSequence("0101 0101 0101");}

 

/** Inserts the string segment in the current sequence,

* starting at the index ind. Returns the new sequence.

*/

public String insertSegment(String segment, int ind)

{ /* implementation not shown */ 


 

/** Updates the sequence to the value in seq

*/

public void changeSequence(String seq)

{ /* implementation not shown */ }
gradShow.changeSequence("0011 0011 0011");}
 

/** Uses the current sequence to turn the light on and off

* for the show

*/

public void display()

{gradShow.display();
   /* implementation not shown */ }

}