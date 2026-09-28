class Solution {
    public boolean isValidSudoku(char[][] board) {
        // row checks
        for(int i=0;i<9;i++){
            Set<Integer> s = new HashSet<>();

            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    if(!s.add(Integer.valueOf(board[i][j]))) return false;
                }
            }
        }

        // col checks
        for(int i=0;i<9;i++){
            Set<Integer> s = new HashSet<>();

            for(int j=0;j<9;j++){
                if(board[j][i] != '.'){
                    if(!s.add(Integer.valueOf(board[j][i]))) return false;
                }
            }
        }

        // individual square check
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                Set<Integer> s = new HashSet<>();
                for(int r = 0;r<3;r++){
                    for(int c = 0; c<3;c++){

                        int x = i*3 + r;
                        int y = j*3 + c;

                        if(board[x][y] != '.'){
                            if(!s.add(Integer.valueOf(board[x][y]))) return false;
                        }

                    }
                }

            }
        }

        return true;

    }
}
