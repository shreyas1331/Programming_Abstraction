//package BackTracking;
//
//public class NqueenDry_Run {
//
//}
////Approach :- we have two options to fill queen in n*n matrix either start filling each queen in row and move to next row
////till last row i.e. row wise or we can start filling each queen in column and move to next column i.e. column wise 
//
////let's fill row wise and we are doing this by the help of recursion but why recursion?
////because we have to try every possible way to place queen in safe position and when there is "try every possibility" recursion is most suitable one.
//
//EXAMPLE:-
////suppose two row is already filled with 'Q' in 4*4 matrix
//                    0  1  2  3
//row = 1st        0 | Q  -  -  - |
//row = 2nd         1 | -  -  Q  - |
//row = 3rd	      2 | -  -  -  - |
//row = 4th	      3 | -  -  -  - |
//
////for placing Q in 3rd row we need to find safe place :- we can see that we can't place Q in 1st place of 3rd row because at row 1st there is a
////queen at 1st place same as we can't place Q at 2nd place in 3rd row because in diagonal of that cell has Q at row 2nd
//
////so before placing Q first check is it safe cell or not to place
////and this can be done by checking three condition
//
//   1.Left didonal        2.column          3.right digonal                  
//			  \				   |              /
//	       0 | [\]  [-]  [-]  [|]  [-]  [-]|/
//         1 | [-]  [\]  [-]  [|]  [-]  [/]|
//	       2 | [-]  [-]  [\]  [|]  [/]  [-]|
//	       3 | [-]  [-]  [-]  [Q]  [-]  [-]|
//		   4 | [-]  [-]  [-]  [-]  [-]  [-]|
//		   5 | [-]  [-]  [-]  [-]  [-]  [-]|
//		   
//	
//		 //we can make constant time for isSafe() 
//
//		   
//		   1. Column :- maintain an array where each index represent each vertical column
//		                     
//		         arr  = | 1  0  1  0 |
//		   	  index =  0  1  2  3
//		   	           |  |  |  |
//		   			   |  |  |  |
//		   	           0  1  2  3
//		              0 | Q  -  -  - |
//		              1 | -  -  Q  - |
//		              2 | -  -  -  - |
//		              3 | -  -  -  - |
//		   // in arr[] '1' represent ----> that index column contains Q in Matrix 
//
//		   2. Right Digonal :-  row + col
//		                                                                               0  1  2  3
//		             j =  0  1  2  3                                                   /  /  /  /    4
//		          i=  0 | -  -  -  - |                   matrix[i][j] =  (i+j)      | 0  1  2  3| /  5
//		              1 | -  -  -  - |                        -------->             | 1  2  3  4| /  6
//		              2 | -  -  -  - |                                              | 2  3  4  5| /
//		              3 | -  -  -  - |                                              | 3  4  5  6|
//		   		      
//		   //now we can make an array of size[i+j] and each index represent each digonal
//		   	           0  1  2  3      4
//		              0 | -  -  -  - | /  5
//		              1 | -  Q  -  - | /  6
//		              2 | -  -  -  Q | /                          arr[0  0  1  0  0  1  0]
//		              3 | -  -  -  - |                          index 0  1  2  3  4  5  6
//		   		   
//		   3. Left Digonal :-  (row - col) + (n-1)
//		                                                                       3   2  1  0
//		             j =  0  1  2  3                                        4    \  \  \  \    
//		          i=  0 | -  -  -  - |  matrix[i][j] = (row - col) + (n-1) 5   \ | 3  2  1  0|
//		              1 | -  -  -  - |                     -------->       6  \  | 4  3  2  1|
//		              2 | -  -  -  - |                                       \   | 5  4  3  2|
//		              3 | -  -  -  - |                                           | 6  5  4  3|
//		   		      
//		   //now we can make an array of size[i+j] and each index represent each digonal
//		   	            
//		               | Q  -  -  - |
//		               | -  -  Q  - |
//		               | -  -  -  - |                          arr[0  0  0  1  1  0  0]
//		               | -  -  -  - |                          index 0  1  2  3  4  5  6		   