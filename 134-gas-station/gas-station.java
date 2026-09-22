class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int Index = 0;
        int totalGas = 0;
        int totalcost = 0;
        int currentgas = 0;
        for(int i = 0 ; i<gas.length ; i++){
            totalGas = totalGas + gas[i];
            totalcost = totalcost + cost[i];
            currentgas = currentgas + gas[i] - cost[i];
            if(currentgas < 0){
                currentgas = 0;
                Index = i + 1;
            }           
        } 
        if(totalGas < totalcost){
            return -1;
        }
        return Index;  
    }
}