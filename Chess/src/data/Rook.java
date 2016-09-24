package data;
public class Rook extends Piece {//torre
    
    public Rook(char pieceSign, boolean moved) {
        super(pieceSign, moved);
        //here it goes movement matrix
        super.setDx(new int[]{-1,0,1,0});//rows
        super.setDy(new int[]{0,1,0,-1});//cols
    }
    
    @Override
    public boolean pieceCheck(Board board, int[]from,int[]to){
        int myDx[] =super.getDx();
        int myDy[] =super.getDy();
        
        if(from[0]==to[0] || from[1]==to[1]){
            Piece sourceP=board.getGameBoard()[from[0]][from[1]].getPiece();
            if(from[0]==to[0] && to[1]<from[1]){//same row, left
                return dfs(board,sourceP, from, to, myDx[3],myDy[3]);
                
            }else if(from[0]==to[0] && to[1]>from[1]){//same row, right
                return dfs(board,sourceP, from, to, myDx[1],myDy[1]);
                
            }else if(to[0]<from[0] && from[1]==to[1]){//same col, up
                return dfs(board,sourceP, from, to, myDx[0],myDy[0]);
                
            }else if(to[0]>from[0] && from[1]==to[1]){//same col, down
                return dfs(board,sourceP, from, to, myDx[2],myDy[2]);
                
            }
        }
        return false;
    }
    
    private boolean dfs(Board board,Piece sourceP, int[]from,int[]to,int x,int y){  //not really a dfs, just a clever recursion
        while(true){
            if(from[0]+x<0 || from[0]+x>7)break;
            if(from[0]+y<0 || from[0]+y>7)break;
            if(board.getGameBoard()[from[0]+x][from[1]+y].getPiece()!=null)break;
            
            if(from[0]+x==to[0] && from[1]+y==to[1]){
                char pieceTo=board.getGameBoard()[to[0]][to[1]].getPiece().getPieceSign();
                
                if(board.getGameBoard()[to[0]][to[1]].getPiece()==null)return true; // true if there is no piece in that box
                return !(Character.isLowerCase(sourceP.getPieceSign()) && Character.isLowerCase(pieceTo));//false if there is a piece of the same color
            }
            from[0]+=x;
            from[1]+=y;
            return dfs(board,sourceP,from,to,x,y);//recursion 
        }
        return false;
    }
}
