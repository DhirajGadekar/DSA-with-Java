/*
 * 14] Insert an Element at the Bottom of a Stack
 */

import java.util.* ;
import java.io.*;
public class Solution {

  public static Stack<Integer> pushAtBottom(Stack <Integer> myStack, int x)  {

      Stack<Integer> s = new Stack<Integer>();
      s.push(x);
      Iterator it = myStack.iterator();
      while(it.hasNext()) {

        s.push((int)it.next());
      }
      return s;
  }
}
