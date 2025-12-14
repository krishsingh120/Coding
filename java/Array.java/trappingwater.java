public class trappingwater {
    public static int trappedwater(int height[]){
        int left = 0 , right = h.length-1;
        int leftmax = 0, rightmax = 0;
        int tw = 0, width = 1;
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= leftmax){
                    leftmax = height[left];
                }
                else{
                    tw = tw + (leftmax - height[left]) * width;
                }    
                left++;    
            } 
            else{
                if(height[right] >= rightmax){
                    rightmax = height[right];
            } 
            else{
                tw = tw + (rightmax - height[right]) * width;
            }
            right--;
        } 

        return tw;
    }
    
    public static void main(String args[]){
       int height[] = {4,2,0,6,3,2,5};
       int trapwater = trappedwater(height);
       System.out.print(trapwater);
    }
}
