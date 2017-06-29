/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rakesh J
 */
public class CombinationalLogic {
    
    int nCr(int n, int r) {
  if (r == 0 || r == n){ 
      return 1;}  // stop recursion, we know the answer.
  return nCr(n-1, r-1) + nCr(n-1, r);  // the answer is made of the sum of two "easier" ones
    }
    
    public static void main(String[] args) {
        CombinationalLogic sol = new CombinationalLogic();
        System.out.println(sol.nCr(4, 2));
    }
}
    

