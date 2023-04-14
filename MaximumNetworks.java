/*****************************************************************DESCRIPTION*************************************************************************************
A software development company is working to create several shared computing systems throught an office. For computers to be on the same network, there are the following contraints:
1. They must be adjacent to one another. 
2. There must be a minimum number of computers.
3. The total processing speed of the network(the sum of each computer's processing speed) must be at least a certain threshold. 
4. A computer can only belong to one network. Given the processing speeds and order of the computers, as well as the network contraints, determine the maximum number of networks that can be formed. 
**********************************************************************************************************************************************************************/
    public static int maximumNetworks(List<Integer> speed, int minComps, long speedThreshold) {
        int numNetworks = 0;
        int currentSpeed = 0;
        int numComputers = 0;

        for (int i = 0; i < speed.size(); i++) {
            currentSpeed += speed.get(i);
            numComputers++;

            if (numComputers >= minComps && currentSpeed >= speedThreshold) {
                numNetworks++;
                currentSpeed = 0;
                numComputers = 0;
            }
        }

        return numNetworks;
    }
