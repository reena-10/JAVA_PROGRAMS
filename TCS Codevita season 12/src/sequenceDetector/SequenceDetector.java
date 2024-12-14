package sequenceDetector;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SequenceDetector {
 static class Transition {
	 char nextState;
	 char input;
	 char output;
	 
	 Transition(char nextState, char input, char output){
		 this.nextState =nextState;
		 this.output = output;
	 }
 }
 public static void main(String[]args) {
	 Scanner scanner = new Scanner(System.in);
	 Map<Character, Map<Character, Transition>> stateTransitions = new HashMap<>();
	 StringBuilder sequence = new  StringBuilder();
	 char currentState ='a';
	 char finalState ='c';
	 boolean isNonOverlapping =true;
	 
	 while(scanner.hasNextLine()) {
		 String line = scanner.nextLine().trim();
		 if(line.isEmpty())continue;
		 
		 char presentState = line.charAt(0);
		 char nextState = line.charAt(1);
		 char input = line.charAt(2);
		 char output = line.charAt(3);
		 //store the transition in the map 
		 stateTransitions
		  .computeIfAbsent(presentState,k -> new HashMap<>())
		  .put(input, new Transition(nextState,input, output));
	 }
		 //Simulate the state transitions based in inputs
		 //We will loop through the possiable inputs(0 and 1) togenerate the sequeence
		 for(char input :new char[] {'0','1'}) {
			 if(stateTransitions.containsKey(currentState)&&stateTransitions.get(currentState).containsKey(input)) {
				Transition transition = stateTransitions.get(currentState).get(input);
				sequence.append(input =='1'? '1':'0');
				currentState = transition.nextState;
				if(transition.output == '1' && currentState == 'a') {
					isNonOverlapping = false ;
				}
			 }
		 }
	 //Display result
	 System.out.println(sequence.toString());
	System.out.println(isNonOverlapping ? "Non Overlapping Sequence Detector" : "Overlapping Sequence Detetor");
 }

}
