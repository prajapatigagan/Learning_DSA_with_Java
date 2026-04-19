package ARRAY_QUESTION;

public class TrapingRainWater {
    public static int trappedRainWater(int hight [])
    {
    int width = 1; //assuming width of each bar is 1 unit
    //calculate left max boundary - array 
    int leftMax [] = new int[hight.length];
    leftMax[0] = hight[0];
    for(int i=1; i<hight.length; i++)
    {
        leftMax[i] = Math.max(hight[i], leftMax[i-1]);
    }
    //calculate right max boundary - array
    int rightMax [] = new int[hight.length];
    rightMax[hight.length-1]= hight[hight.length-1];
    for(int i=hight.length-2; i>=0; i--){
        rightMax[i] = Math.max(hight[i], rightMax[i+1]);
    }

    int TrappedWater = 0;
    //loop through each element and calculate trapped water
    for(int i=0; i<hight.length; i++)
    {
        int waterLevel =Math.min(leftMax[i], rightMax[i]);
        TrappedWater+= (waterLevel - hight[i])*width;
    }

    //water level = min(left max boundary, right max boundary)
    //trapped water = water level - height[i]
    return TrappedWater;
    }
    public static void main(String[] args) {
        int hight [] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(hight));
    }
}
