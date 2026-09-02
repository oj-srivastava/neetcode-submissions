class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, Integer> gridMap1 = new HashMap<>();
        Map<Character, Integer> gridMap2 = new HashMap<>();
        Map<Character, Integer> gridMap3 = new HashMap<>();
        Map<Character, Integer> gridMap4 = new HashMap<>();
        Map<Character, Integer> gridMap5 = new HashMap<>();
        Map<Character, Integer> gridMap6 = new HashMap<>();
        Map<Character, Integer> gridMap7 = new HashMap<>();
        Map<Character, Integer> gridMap8 = new HashMap<>();
        Map<Character, Integer> gridMap9 = new HashMap<>();
        // Check if lines has duplicates
        for(int i=0;i<9;i++){
            Map<Character, Integer> colMap = new HashMap<>();
            Map<Character, Integer> rowMap = new HashMap<>();
            for(int j=0;j<9;j++){
                // insert to row i the number seen as board[i][j]
                if(rowMap.containsKey(board[i][j]) && board[i][j] != '.'){
                    System.out.println("Row");
                    System.out.println(i);
                    System.out.println(j);
                    return false;
                } else {
                    rowMap.put(board[i][j],1);
                }
                // insert to col i the number seen as board[j][i]
                if(colMap.containsKey(board[j][i]) && board[j][i] != '.'){
                    System.out.println("Col");
                    System.out.println(i);
                    System.out.println(j);
                    return false;
                } else {
                    colMap.put(board[j][i],1);
                }
                // Which grid it belongs to
                Map<Character, Integer> gridMap = null;
                if(0<=i && 2>=i){
                    if(0<=j && 2>=j){
                        gridMap=gridMap1;
                    } else if(3<=j && 5>=j){
                        gridMap =gridMap2;
                    } else if(6<=j && 8>=j) {
                        gridMap=gridMap3;
                    }
                } else if(3<=i && 5>=i){
                    if(0<=j && 2>=j){
                        gridMap=gridMap4;
                    } else if(3<=j && 5>=j){
                        gridMap=gridMap5;
                    } else if(6<=j && 8>=j) {
                        gridMap=gridMap6;
                    }
                } else if(6<=i && 8>=i) {
                    if(0<=j && 2>=j){
                        gridMap=gridMap7;
                    } else if(3<=j && 5>=j){
                        gridMap=gridMap8;
                    } else if(6<=j && 8>=j) {
                        gridMap=gridMap9;
                    }
                }
                if(gridMap.containsKey(board[i][j]) && board[i][j] != '.'){
                    System.out.println(i);
                    System.out.println(j);
                    return false;
                } else {
                    gridMap.put(board[i][j],1);
                }
            }
        }
        return true;
    }
}
