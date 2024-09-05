class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        if(image[sr][sc]==color){
            return image;
        }
       
        fill(image,sr,sc, color, original);
        return image;
    }
     
     private void fill(int[][] image,int sr, int sc, int color, int original){
        if( sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc]!=original){
            return;
        }
        image[sr][sc]=color;

        fill(image, sr-1, sc, color, original);
        fill(image, sr+1, sc, color, original);
        fill(image, sr, sc-1, color, original);
        fill(image, sr, sc+1, color, original);

     }
}