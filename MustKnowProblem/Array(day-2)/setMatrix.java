public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> matrix) {
        boolean firstRow = false;
        boolean firstCol = false;
        
        for (int i=0;i<matrix.size();i++) {
            if (matrix.get(i).get(0) == 0) {
                firstCol = true;
                break;
            }
        }
        
        for (int i=0;i<matrix.get(0).size();i++) {
            if (matrix.get(0).get(i) == 0) {
                firstRow = true;
                break;
            }
        }
        //check for all posible indexes 
        for (int i=0;i<matrix.size();i++) {
            for (int j=0;j<matrix.get(0).size();j++) {
                if (matrix.get(i).get(j) == 0) {
                    matrix.get(i).set(0, 0);//update that first index of the row that has 0 in [row][col](previous)
                    matrix.get(0).set(j, 0);//now update the first row and that column value
                }
            }
        }
        //checking from row 1 and col 1 as col 1 and row 1 is already chk
        for(int i=1; i<matrix.size(); i++){
            for(int j=1; j<matrix.get(i).size(); j++){
                if(matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0){//check for(1,0) and (0,1) according to variation of i and j
                   matrix.get(i).set(j, 0);//set value for that row col
                }
            }
        }
        
        if(firstCol){
            for(int i=0; i<matrix.size(); i++)
                matrix.get(i).set(0,0);//set value for first col 0 if there is any index
        }
 
        if(firstRow){//similar for first row
            for(int i=0; i<matrix.get(0).size(); i++)
                matrix.get(0).set(i, 0);
        }
    }
}
